����kafka�������裺
ǰ��:��װgo������docker,docker-compose����,���ؾ������ɽڵ�֤�飬ͨ�������ļ�
������
      2 10.0.15.35  212.129.164.210 ��֯1 :2 peer , 1 couchdb,1 ca, 1 cli , mysql(root,root)
      3 10.0.15.23  212.129.164.71 ��֯2  :2 peer , 1 couchdb,1 ca, 1 cli��  
      4 10.0.15.37  211.159.241.222 order+zookeeper+kafka ,postgres + block-explorer
mysql: https://blog.csdn.net/qq_37598011/article/details/93489404 


notes:
1 configtx.yaml
   1.1 OrdererType: kafka
   1.2 Kafka:
      # Brokers: A list of Kafka brokers to which the orderer connects
      # NOTE: Use IP:port notation
      Brokers:
        - 10.2.0.2:9092
2 peer-base.yaml
    - CORE_VM_DOCKER_HOSTCONFIG_NETWORKMODE=`kafka`��Ŀ¼���ƣ�_byfn
  �������ݲ��������ļ�
�ӿڵ��ò��裺
1 �û�ע��peerOrg1
2 ����ͨ�������������ɵ�ͨ�������ļ�һ�£����˲����Ѽ���ͨ��
3 ��װ����
4 ʵ�������루������{������ǵ�һ�Σ����ǰ�װ����}
5 ��������
6 ��ѯ
7 �û�ע��peerOrg2
8 �ڵ����ͨ��
9 ��װ����
10 peerOrg2��ѯ���˹���ʵ�������룬�ٶȽ�����

��װ������֣���
peer channel update -o orderer.example.com:7050 -c bhfaechannel -f channel-artifacts/Org1MSPanchors.tx

peer chaincode install -n java0521 -v 1.0 -p /opt/gopath/src/github.com/chaincode/chaincode_java06/ -l java

peer chaincode instantiate -o orderer.example.com:7050  -C bhfaechannel -n java0521 -v 1.0 -c '{"Args":["init"]}' -P "AND('Org1MSP.peer','Org2MSP.peer')"

 
 %Ojos.kAw7GV
 
 0,<j5cILt%Mg
