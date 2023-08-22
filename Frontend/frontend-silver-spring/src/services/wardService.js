import axios from "axios";

const url = "http://localhost:8080/wards";

const getAll = () => {
  return axios.get(url);
};

export default {getAll};