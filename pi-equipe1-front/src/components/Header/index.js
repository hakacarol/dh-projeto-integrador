import './style.css';
import { Navbar, Nav } from 'react-bootstrap';
import { Link } from 'react-router-dom';
import { useUserContext } from '../../contexts/UserContext';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faBars } from '@fortawesome/free-solid-svg-icons';

const Header = () => {

    const { user, setUser } = useUserContext();

    if (user) {
        return (
            <Navbar id="header" className="fixed-top px-3 d-flex" collapseOnSelect expand="md" bg="dark" variant="dark">
                <Navbar.Brand as={Link} to="/"><div id="brand"><h2>db</h2></div></Navbar.Brand>
                <Nav.Link className="p-0 me-auto" as={Link} to="/"><div id="moto"><p>sinta-se em</p><b> casa</b></div></Nav.Link>
                <Navbar.Toggle aria-controls="responsive-navbar-nav">
                    <FontAwesomeIcon
                        icon={faBars} color="var(--primary-color)" size="lg" />
                </Navbar.Toggle>
                <Navbar.Collapse id="responsive-navbar-nav" className="justify-content-end">
                    <Nav >
                        <Nav.Link className="d-flex align-items-center" as={Link} to="/"><div id="avatar" className="me-1">CH</div><p className="m-0">Olá, Carol!</p></Nav.Link>
                        <Nav.Link className="access d-flex align-items-center" as={Link} to="/" onClick={() => {
                            localStorage.removeItem('signed');
                            setUser();
                        }}><button
                            className="logout">sair</button></Nav.Link>
                    </Nav>
                </Navbar.Collapse>
            </Navbar>
        )
    }

    return (
        <Navbar className="fixed-top px-3" collapseOnSelect expand="md" bg="dark" variant="dark">
            <Navbar.Brand className="me auto" as={Link} to="/"><div id="brand"><h2>db</h2></div></Navbar.Brand>
            <Nav.Link className="p-0 me-auto" as={Link} to="/"><div id="moto"><p>sinta-se em</p><b> casa</b></div></Nav.Link>
            <Navbar.Toggle aria-controls="responsive-navbar-nav" />
            <Navbar.Collapse id="responsive-navbar-nav d-flex" className="justify-content-end">
                <Nav >
                    <Nav.Link className="access" as={Link} to="/login"><button className="logout">login</button></Nav.Link>
                    <Nav.Link className="access" as={Link} to="/cadastro"><button className="logout">cadastrar</button></Nav.Link>
                </Nav>
            </Navbar.Collapse>
        </Navbar>
    )
}

export default Header;