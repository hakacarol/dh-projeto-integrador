import './style.css';
import { useParams } from 'react-router-dom';
import useAxios from '../../hooks/useAxios';
import { ProductContext } from '../../contexts/ProductContext';
import ProductTitle from './components/ProductTitle';
import Location from './components/Location';
import Image from './components/Image';
import Characteristic from './components/Characteristic';
import { Helmet } from 'react-helmet-async'
import Calendar from './components/Calendar';

const Product = () => {

    const { productId } = useParams();
    const product = useAxios(`/product/${productId}`);

    // const { productInfo, setProductInfo } = useContext(ProductContext);
    // let product2 = setProductInfo(product);


    // useEffect(() => {
    //     localStorage.setItem('ProductInfo', JSON.stringify([product]));
    //     setProductInfo([product]);
    // }, [product]);

    return (
        <>
            <Helmet>
                <title>{`db | ${product.name}`}</title>
            </Helmet>
            <ProductTitle />
            <Location />
            <Image />
            <Characteristic/>
            <Calendar />

        </>
    );
};

export default Product;