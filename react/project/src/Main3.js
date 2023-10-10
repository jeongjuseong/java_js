import {useState} from "react";
import { useLocation } from "react-router-dom";

function Main3(){
  let [id, setId] = useState('');
  let [pw, setPw] = useState('');
  const location = useLocation();
  //location.state에 전송할 데이터가 있으면
  if(location.state != null){
    //state에 전송한 아이디와 비번을 가져옴
    let tmpId = location.state.id;
    let tmpPw = location.state.pw;
    //가져온 비번을 state의 setter를 이용해 값을 수정
    setId(tmpId);
    setPw(tmpPw);
    //랜더링이 됐을 때 이전값이 남아있어서 랜더링이 무한반복 되는 
    //현상을 없애기 위해 사용한 location의 state를 null로 처리
    location.state = null;
  }
  return (
    <main>
      <h1>메인3</h1>
      <h2>ID : {id}</h2>
      <h2>PW : {pw}</h2>
    </main>
  )
}

export default Main3;