import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.SocketException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.*;
import java.sql.Date;
import java.util.*;
import java.util.concurrent.Executor;

import javax.transaction.xa.XAResource;

import oracle.jdbc.LogicalTransactionId;
import oracle.jdbc.LogicalTransactionIdEventListener;
import oracle.jdbc.OracleOCIFailover;
import oracle.jdbc.OracleSavepoint;
import oracle.jdbc.aq.*;
import oracle.jdbc.dcn.DatabaseChangeRegistration;
import oracle.jdbc.internal.*;
import oracle.jdbc.oracore.OracleTypeADT;
import oracle.jdbc.oracore.OracleTypeCLOB;
import oracle.jdbc.pool.OracleConnectionCacheCallback;
import oracle.jdbc.pool.OraclePooledConnection;
import oracle.sql.*;

public class FakeOracleConnetion implements OracleConnection {

    @Override
    public void setPDBChangeEventListener(PDBChangeEventListener var1) throws SQLException {
        // TODO Auto-generated method stub
    }

    public int getVarTypeMaxLenCompat() throws SQLException {
        return 0;
    }

    public byte getInstanceProperty(InstanceProperty instanceProperty) throws SQLException {
        return 0;
    }

    public int numberOfDescriptorCacheEntries() {
        return 0;
    }

    public Enumeration descriptorCacheKeys() {
        return null;
    }

    public long getTdoCState(String s, String s1) throws SQLException {
        return 0;
    }

    public long getTdoCState(String s) throws SQLException {
        return 0;
    }

    public BufferCacheStatistics getByteBufferCacheStatistics() {
        return null;
    }

    public BufferCacheStatistics getCharBufferCacheStatistics() {
        return null;
    }

    public void cleanupAndClose(boolean b) throws SQLException {

    }

    public Properties getServerSessionInfo() throws SQLException {
        return null;
    }

    public CLOB createClobWithUnpickledBytes(byte[] bytes) throws SQLException {
        return null;
    }

    public BLOB createBlobWithUnpickledBytes(byte[] bytes) throws SQLException {
        return null;
    }

    public boolean getMapDateToTimestamp() {
        return false;
    }

    public byte[] createLightweightSession(String s, KeywordValueLong[] keywordValueLongs, int i, KeywordValueLong[][] keywordValueLongs1, int[] ints) throws SQLException {
        return new byte[0];
    }

    public void executeLightweightSessionPiggyback(int i, byte[] bytes, KeywordValueLong[] keywordValueLongs, int i1) throws SQLException {

    }

    public void doXSNamespaceOp(XSOperationCode xsOperationCode, byte[] bytes, XSNamespace[] xsNamespaces, XSNamespace[][] xsNamespaces1, XSSecureId xsSecureId) throws SQLException {

    }

    public void doXSNamespaceOp(XSOperationCode xsOperationCode, byte[] bytes, XSNamespace[] xsNamespaces, XSSecureId xsSecureId) throws SQLException {

    }

    public byte[] doXSSessionCreateOp(XSSessionOperationCode xsSessionOperationCode, XSSecureId xsSecureId, byte[] bytes, XSPrincipal xsPrincipal, String s, XSNamespace[] xsNamespaces, XSSessionModeFlag xsSessionModeFlag, XSKeyval xsKeyval) throws SQLException {
        return new byte[0];
    }

    public void doXSSessionDestroyOp(byte[] bytes, XSSecureId xsSecureId, byte[] bytes1) throws SQLException {

    }

    public void doXSSessionAttachOp(int i, byte[] bytes, XSSecureId xsSecureId, byte[] bytes1, XSPrincipal xsPrincipal, String[] strings, String[] strings1, String[] strings2, XSNamespace[] xsNamespaces, XSNamespace[] xsNamespaces1, XSNamespace[] xsNamespaces2, TIMESTAMPTZ timestamptz, TIMESTAMPTZ timestamptz1, int i1, long l, XSKeyval xsKeyval, int[] ints) throws SQLException {

    }

    public void doXSSessionDetachOp(int i, byte[] bytes, XSSecureId xsSecureId, boolean b) throws SQLException {

    }

    public void doXSSessionChangeOp(XSSessionSetOperationCode xsSessionSetOperationCode, byte[] bytes, XSSecureId xsSecureId, XSSessionParameters xsSessionParameters) throws SQLException {

    }

    public String getDefaultSchemaNameForNamedTypes() throws SQLException {
        return null;
    }

    public void setUsable(boolean b) {

    }

    public Class getClassForType(String s, Map<String, Class> map) {
        return null;
    }

    public void addXSEventListener(XSEventListener xsEventListener) throws SQLException {

    }

    public void addXSEventListener(XSEventListener xsEventListener, Executor executor) throws SQLException {

    }

    public void removeXSEventListener(XSEventListener xsEventListener) throws SQLException {

    }

    public int getTimezoneVersionNumber() throws SQLException {
        return 0;
    }

    public void removeAllXSEventListener() throws SQLException {

    }

    public TIMEZONETAB getTIMEZONETAB() throws SQLException {
        return null;
    }

    public String getDatabaseTimeZone() throws SQLException {
        return null;
    }

    public boolean getTimestamptzInGmt() {
        return false;
    }

    public boolean getUse1900AsYearForTime() {
        return false;
    }

    public boolean isDataInLocatorEnabled() throws SQLException {
        return false;
    }

    public boolean isLobStreamPosStandardCompliant() throws SQLException {
        return false;
    }

    public long getCurrentSCN() throws SQLException {
        return 0;
    }

    public EnumSet<TransactionState> getTransactionState() throws SQLException {
        return null;
    }

    public boolean isConnectionSocketKeepAlive() throws SocketException, SQLException {
        return false;
    }

    public void setReplayOperations(EnumSet<ReplayOperation> enumSet) throws SQLException {

    }

    public void setReplayingMode(boolean b) throws SQLException {

    }

    public void beginNonRequestCalls() throws SQLException {

    }

    public void endNonRequestCalls() throws SQLException {

    }

    public void setReplayContext(ReplayContext[] replayContexts) throws SQLException {

    }

    public ReplayContext[] getReplayContext() throws SQLException {
        return new ReplayContext[0];
    }

    public ReplayContext getLastReplayContext() throws SQLException {
        return null;
    }

    public void registerEndReplayCallback(EndReplayCallback endReplayCallback) throws SQLException {

    }

    public int getEOC() throws SQLException {
        return 0;
    }

    public byte[] getDerivedKeyInternal(byte[] bytes, int i) throws NoSuchAlgorithmException, InvalidKeySpecException, SQLException {
        return new byte[0];
    }

    public short getExecutingRPCFunctionCode() {
        return 0;
    }

    public String getExecutingRPCSQL() {
        return null;
    }

    public void jmsEnqueue(String s, JMSEnqueueOptions jmsEnqueueOptions, JMSMessage jmsMessage, AQMessageProperties aqMessageProperties) throws SQLException {

    }

    public JMSMessage jmsDequeue(String s, JMSDequeueOptions jmsDequeueOptions) throws SQLException {
        return null;
    }

    public JMSMessage jmsDequeue(String s, JMSDequeueOptions jmsDequeueOptions, String s1) throws SQLException {
        return null;
    }

    public Map<String, JMSNotificationRegistration> registerJMSNotification(String[] strings, Map<String, Properties> map) throws SQLException {
        return null;
    }

    public void unregisterJMSNotification(JMSNotificationRegistration jmsNotificationRegistration) throws SQLException {

    }

    public void ackJMSNotification(JMSNotificationRegistration jmsNotificationRegistration, byte[] bytes, JMSNotificationRegistration.Directive directive) throws SQLException {

    }

    public int getNegotiatedSDU() throws SQLException {
        return 0;
    }

    public void commit(EnumSet<CommitOption> enumSet) throws SQLException {

    }

    public String getCurrentSchema() throws SQLException {
        return null;
    }

    public int pingDatabase() throws SQLException {
        return 0;
    }

    public void shutdown(DatabaseShutdownMode databaseShutdownMode) throws SQLException {

    }

    public void startup(DatabaseStartupMode databaseStartupMode) throws SQLException {

    }

    public String getSessionTimeZoneOffset() throws SQLException {
        return null;
    }

    public AQNotificationRegistration[] registerAQNotification(String[] strings, Properties[] properties, Properties properties1) throws SQLException {
        return new AQNotificationRegistration[0];
    }

    public void unregisterAQNotification(AQNotificationRegistration aqNotificationRegistration) throws SQLException {

    }

    public AQMessage dequeue(String s, AQDequeueOptions aqDequeueOptions, byte[] bytes) throws SQLException {
        return null;
    }

    public AQMessage dequeue(String s, AQDequeueOptions aqDequeueOptions, String s1) throws SQLException {
        return null;
    }

    public void enqueue(String s, AQEnqueueOptions aqEnqueueOptions, AQMessage aqMessage) throws SQLException {

    }

    public DatabaseChangeRegistration registerDatabaseChangeNotification(Properties properties) throws SQLException {
        return null;
    }

    public DatabaseChangeRegistration getDatabaseChangeRegistration(int i) throws SQLException {
        return null;
    }

    public void unregisterDatabaseChangeNotification(DatabaseChangeRegistration databaseChangeRegistration) throws SQLException {

    }

    public void unregisterDatabaseChangeNotification(int i, String s, int i1) throws SQLException {

    }

    public void unregisterDatabaseChangeNotification(int i) throws SQLException {

    }

    public void unregisterDatabaseChangeNotification(long l, String s) throws SQLException {

    }

    public ARRAY createARRAY(String s, Object o) throws SQLException {
        return null;
    }

    public Array createOracleArray(String s, Object o) throws SQLException {
        return null;
    }

    public BINARY_DOUBLE createBINARY_DOUBLE(double v) throws SQLException {
        return null;
    }

    public BINARY_FLOAT createBINARY_FLOAT(float v) throws SQLException {
        return null;
    }

    public DATE createDATE(Date date) throws SQLException {
        return null;
    }

    public DATE createDATE(Time time) throws SQLException {
        return null;
    }

    public DATE createDATE(Timestamp timestamp) throws SQLException {
        return null;
    }

    public DATE createDATE(Date date, Calendar calendar) throws SQLException {
        return null;
    }

    public DATE createDATE(Time time, Calendar calendar) throws SQLException {
        return null;
    }

    public DATE createDATE(Timestamp timestamp, Calendar calendar) throws SQLException {
        return null;
    }

    public DATE createDATE(String s) throws SQLException {
        return null;
    }

    public INTERVALDS createINTERVALDS(String s) throws SQLException {
        return null;
    }

    public INTERVALYM createINTERVALYM(String s) throws SQLException {
        return null;
    }

    public NUMBER createNUMBER(boolean b) throws SQLException {
        return null;
    }

    public NUMBER createNUMBER(byte b) throws SQLException {
        return null;
    }

    public NUMBER createNUMBER(short i) throws SQLException {
        return null;
    }

    public NUMBER createNUMBER(int i) throws SQLException {
        return null;
    }

    public NUMBER createNUMBER(long l) throws SQLException {
        return null;
    }

    public NUMBER createNUMBER(float v) throws SQLException {
        return null;
    }

    public NUMBER createNUMBER(double v) throws SQLException {
        return null;
    }

    public NUMBER createNUMBER(BigDecimal bigDecimal) throws SQLException {
        return null;
    }

    public NUMBER createNUMBER(BigInteger bigInteger) throws SQLException {
        return null;
    }

    public NUMBER createNUMBER(String s, int i) throws SQLException {
        return null;
    }

    public TIMESTAMP createTIMESTAMP(Date date) throws SQLException {
        return null;
    }

    public TIMESTAMP createTIMESTAMP(DATE date) throws SQLException {
        return null;
    }

    public TIMESTAMP createTIMESTAMP(Time time) throws SQLException {
        return null;
    }

    public TIMESTAMP createTIMESTAMP(Timestamp timestamp) throws SQLException {
        return null;
    }

    public TIMESTAMP createTIMESTAMP(String s) throws SQLException {
        return null;
    }

    public TIMESTAMPTZ createTIMESTAMPTZ(Date date) throws SQLException {
        return null;
    }

    public TIMESTAMPTZ createTIMESTAMPTZ(Date date, Calendar calendar) throws SQLException {
        return null;
    }

    public TIMESTAMPTZ createTIMESTAMPTZ(Time time) throws SQLException {
        return null;
    }

    public TIMESTAMPTZ createTIMESTAMPTZ(Time time, Calendar calendar) throws SQLException {
        return null;
    }

    public TIMESTAMPTZ createTIMESTAMPTZ(Timestamp timestamp) throws SQLException {
        return null;
    }

    public TIMESTAMPTZ createTIMESTAMPTZ(Timestamp timestamp, Calendar calendar) throws SQLException {
        return null;
    }

    public TIMESTAMPTZ createTIMESTAMPTZ(String s) throws SQLException {
        return null;
    }

    public TIMESTAMPTZ createTIMESTAMPTZ(String s, Calendar calendar) throws SQLException {
        return null;
    }

    public TIMESTAMPTZ createTIMESTAMPTZ(DATE date) throws SQLException {
        return null;
    }

    public TIMESTAMPLTZ createTIMESTAMPLTZ(Date date, Calendar calendar) throws SQLException {
        return null;
    }

    public TIMESTAMPLTZ createTIMESTAMPLTZ(Time time, Calendar calendar) throws SQLException {
        return null;
    }

    public TIMESTAMPLTZ createTIMESTAMPLTZ(Timestamp timestamp, Calendar calendar) throws SQLException {
        return null;
    }

    public TIMESTAMPLTZ createTIMESTAMPLTZ(String s, Calendar calendar) throws SQLException {
        return null;
    }

    public TIMESTAMPLTZ createTIMESTAMPLTZ(DATE date, Calendar calendar) throws SQLException {
        return null;
    }

    public TypeDescriptor[] getAllTypeDescriptorsInCurrentSchema() throws SQLException {
        return new TypeDescriptor[0];
    }

    public TypeDescriptor[] getTypeDescriptorsFromListInCurrentSchema(String[] strings) throws SQLException {
        return new TypeDescriptor[0];
    }

    public TypeDescriptor[] getTypeDescriptorsFromList(String[][] strings) throws SQLException {
        return new TypeDescriptor[0];
    }

    public String getDataIntegrityAlgorithmName() throws SQLException {
        return null;
    }

    public String getEncryptionAlgorithmName() throws SQLException {
        return null;
    }

    public String getAuthenticationAdaptorName() throws SQLException {
        return null;
    }

    public boolean isUsable() {
        return false;
    }

    public void setDefaultTimeZone(TimeZone timeZone) throws SQLException {

    }

    public TimeZone getDefaultTimeZone() throws SQLException {
        return null;
    }

    public void setApplicationContext(String s, String s1, String s2) throws SQLException {

    }

    public void clearAllApplicationContext(String s) throws SQLException {

    }

    public void addLogicalTransactionIdEventListener(LogicalTransactionIdEventListener logicalTransactionIdEventListener) throws SQLException {

    }

    public void addLogicalTransactionIdEventListener(LogicalTransactionIdEventListener logicalTransactionIdEventListener, Executor executor) throws SQLException {

    }

    public void removeLogicalTransactionIdEventListener(LogicalTransactionIdEventListener logicalTransactionIdEventListener) throws SQLException {

    }

    public LogicalTransactionId getLogicalTransactionId() throws SQLException {
        return null;
    }

    public boolean isDRCPEnabled() throws SQLException {
        return false;
    }

    public boolean attachServerConnection() throws SQLException {
        return false;
    }

    public void detachServerConnection(String s) throws SQLException {

    }

    public boolean needToPurgeStatementCache() throws SQLException {
        return false;
    }

    public void setACProxy(Object o) {

    }

    public Object getACProxy() {
        return null;
    }

    @Override
    public void setPDBChangeEventListener(PDBChangeEventListener var1, Executor var2) throws SQLException {
        // TODO Auto-generated method stub
    }

    @Override
    public void setChecksumMode(OracleConnection.ChecksumMode var1) throws SQLException {
        // TODO Auto-generated method stub
    }

    @Override
    public Statement createStatement() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setTypeMap(Map paramMap) throws SQLException {
        // TODO Auto-generated method stub
    }

    @Override
    public PreparedStatement prepareStatement(String paramString) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CallableStatement prepareCall(String paramString) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String nativeSQL(String paramString) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setAutoCommit(boolean paramBoolean) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean getAutoCommit() throws SQLException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void commit() throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void rollback() throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void close() throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isClosed() throws SQLException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public DatabaseMetaData getMetaData() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setReadOnly(boolean paramBoolean) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isReadOnly() throws SQLException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setCatalog(String paramString) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public String getCatalog() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setTransactionIsolation(int paramInt) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public int getTransactionIsolation() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void clearWarnings() throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public Statement createStatement(int paramInt1, int paramInt2) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String paramString, int paramInt1, int paramInt2)
            throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CallableStatement prepareCall(String paramString, int paramInt1, int paramInt2)
            throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Map<String, Class<?>> getTypeMap() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public void setHoldability(int paramInt) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public int getHoldability() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Savepoint setSavepoint() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Savepoint setSavepoint(String paramString) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void rollback(Savepoint paramSavepoint) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void releaseSavepoint(Savepoint paramSavepoint) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public Statement createStatement(int paramInt1, int paramInt2, int paramInt3)
            throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String paramString, int paramInt1, int paramInt2,
                                              int paramInt3) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CallableStatement prepareCall(String paramString, int paramInt1, int paramInt2,
                                         int paramInt3) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String paramString, int paramInt) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String paramString, int[] paramArrayOfInt)
            throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String paramString, String[] paramArrayOfString)
            throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Clob createClob() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Blob createBlob() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public NClob createNClob() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SQLXML createSQLXML() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isValid(int paramInt) throws SQLException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setClientInfo(String paramString1, String paramString2)
            throws SQLClientInfoException {
        // TODO Auto-generated method stub

    }

    @Override
    public void setClientInfo(Properties paramProperties) throws SQLClientInfoException {
        // TODO Auto-generated method stub

    }

    @Override
    public String getClientInfo(String paramString) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Properties getClientInfo() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Array createArrayOf(String paramString, Object[] paramArrayOfObject) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Struct createStruct(String paramString, Object[] paramArrayOfObject) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setSchema(String paramString) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public String getSchema() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void abort(Executor paramExecutor) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void setNetworkTimeout(Executor paramExecutor, int paramInt) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public int getNetworkTimeout() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public <T> T unwrap(Class<T> paramClass) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> paramClass) throws SQLException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void archive(int paramInt1, int paramInt2, String paramString) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void openProxySession(int paramInt, Properties paramProperties) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean getAutoClose() throws SQLException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int getDefaultExecuteBatch() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getDefaultRowPrefetch() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Object getDescriptor(String paramString) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] getEndToEndMetrics() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public short getEndToEndECIDSequenceNumber() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean getIncludeSynonyms() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean getRestrictGetTables() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Object getJavaObject(String paramString) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean getRemarksReporting() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String getSQLType(Object paramObject) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getStmtCacheSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public short getStructAttrCsId() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getUserName() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean getUsingXAFlag() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean getXAErrorFlag() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int pingDatabase(int paramInt) throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void putDescriptor(String paramString, Object paramObject) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void registerSQLType(String paramString, Class paramClass) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void registerSQLType(String paramString1, String paramString2) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void setAutoClose(boolean paramBoolean) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void setDefaultExecuteBatch(int paramInt) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void setDefaultRowPrefetch(int paramInt) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void setEndToEndMetrics(String[] paramArrayOfString, short paramShort)
            throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void setIncludeSynonyms(boolean paramBoolean) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setRemarksReporting(boolean paramBoolean) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setRestrictGetTables(boolean paramBoolean) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setStmtCacheSize(int paramInt) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void setStmtCacheSize(int paramInt, boolean paramBoolean) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void setStatementCacheSize(int paramInt) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public int getStatementCacheSize() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setImplicitCachingEnabled(boolean paramBoolean) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean getImplicitCachingEnabled() throws SQLException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setExplicitCachingEnabled(boolean paramBoolean) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean getExplicitCachingEnabled() throws SQLException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void purgeImplicitCache() throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void purgeExplicitCache() throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public PreparedStatement getStatementWithKey(String paramString) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CallableStatement getCallWithKey(String paramString) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setUsingXAFlag(boolean paramBoolean) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setXAErrorFlag(boolean paramBoolean) {
        // TODO Auto-generated method stub

    }


    @Override
    public void startup(String paramString, int paramInt) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public PreparedStatement prepareStatementWithKey(String paramString) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CallableStatement prepareCallWithKey(String paramString) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setCreateStatementAsRefCursor(boolean paramBoolean) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean getCreateStatementAsRefCursor() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setSessionTimeZone(String paramString) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public String getSessionTimeZone() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Properties getProperties() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Connection _getPC() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isLogicalConnection() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void registerTAFCallback(OracleOCIFailover paramOracleOCIFailover, Object paramObject)
            throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public OracleConnection unwrap() {
        // TODO Auto-generated method stub
        return null;
    }

    public void setWrapper(OracleConnection paramOracleConnection) {
        // TODO Auto-generated method stub

    }

    @Override
    public oracle.jdbc.internal.OracleConnection physicalConnectionWithin() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public OracleSavepoint oracleSetSavepoint() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public OracleSavepoint oracleSetSavepoint(String paramString) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void oracleRollback(OracleSavepoint paramOracleSavepoint) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void oracleReleaseSavepoint(OracleSavepoint paramOracleSavepoint) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void close(Properties paramProperties) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void close(int paramInt) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isProxySession() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void applyConnectionAttributes(Properties paramProperties) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public Properties getConnectionAttributes() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Properties getUnMatchedConnectionAttributes() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void registerConnectionCacheCallback(
            OracleConnectionCacheCallback paramOracleConnectionCacheCallback, Object paramObject,
            int paramInt) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void setConnectionReleasePriority(int paramInt) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public int getConnectionReleasePriority() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setPlsqlWarnings(String paramString) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public void setWrapper(oracle.jdbc.OracleConnection paramOracleConnection) {
        // TODO Auto-generated method stub

    }

    @Override
    public short getStructAttrNCsId() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Properties getDBAccessProperties() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Properties getOCIHandles() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getDatabaseProductVersion() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void cancel() throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public String getURL() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public short getVersionNumber() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Map getJavaObjectTypeMap() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setJavaObjectTypeMap(Map paramMap) {
        // TODO Auto-generated method stub

    }

    @Override
    public BfileDBAccess createBfileDBAccess() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BlobDBAccess createBlobDBAccess() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ClobDBAccess createClobDBAccess() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setDefaultFixedString(boolean paramBoolean) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean getDefaultFixedString() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public oracle.jdbc.OracleConnection getWrapper() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Class classForNameAndSchema(String paramString1, String paramString2)
            throws ClassNotFoundException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setFDO(byte[] paramArrayOfByte) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public byte[] getFDO(boolean paramBoolean) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean getBigEndian() throws SQLException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Object getDescriptor(byte[] paramArrayOfByte) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void putDescriptor(byte[] paramArrayOfByte, Object paramObject) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public OracleConnection getPhysicalConnection() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void removeDescriptor(String paramString) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeAllDescriptor() {
        // TODO Auto-generated method stub

    }


    @Override
    public Datum toDatum(CustomDatum paramCustomDatum) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public short getDbCsId() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public short getJdbcCsId() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public short getNCharSet() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ResultSet newArrayDataResultSet(Datum[] paramArrayOfDatum, long paramLong, int paramInt,
                                           Map paramMap) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResultSet newArrayDataResultSet(ARRAY paramARRAY, long paramLong, int paramInt,
                                           Map paramMap) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResultSet newArrayLocatorResultSet(ArrayDescriptor paramArrayDescriptor,
                                              byte[] paramArrayOfByte, long paramLong, int paramInt, Map paramMap)
            throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResultSetMetaData newStructMetaData(StructDescriptor paramStructDescriptor)
            throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void getForm(OracleTypeADT paramOracleTypeADT, OracleTypeCLOB paramOracleTypeCLOB,
                        int paramInt) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public int CHARBytesToJavaChars(byte[] paramArrayOfByte, int paramInt, char[] paramArrayOfChar)
            throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int NCHARBytesToJavaChars(byte[] paramArrayOfByte, int paramInt, char[] paramArrayOfChar)
            throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean IsNCharFixedWith() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public short getDriverCharSet() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getC2SNlsRatio() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getMaxCharSize() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getMaxCharbyteSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getMaxNCharbyteSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isCharSetMultibyte(short paramShort) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int javaCharsToCHARBytes(char[] paramArrayOfChar, int paramInt, byte[] paramArrayOfByte)
            throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int javaCharsToNCHARBytes(char[] paramArrayOfChar, int paramInt, byte[] paramArrayOfByte)
            throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setStartTime(long paramLong) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public long getStartTime() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isStatementCacheInitialized() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void getPropertyForPooledConnection(OraclePooledConnection paramOraclePooledConnection)
            throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public String getProtocolType() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Connection getLogicalConnection(OraclePooledConnection paramOraclePooledConnection,
                                           boolean paramBoolean) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setTxnMode(int paramInt) {
        // TODO Auto-generated method stub

    }

    @Override
    public int getTxnMode() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getHeapAllocSize() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getOCIEnvHeapAllocSize() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setAbandonedTimeoutEnabled(boolean paramBoolean) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public int getHeartbeatNoChangeCount() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void closeInternal(boolean paramBoolean) throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public OracleConnectionCacheCallback getConnectionCacheCallbackObj() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object getConnectionCacheCallbackPrivObj() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getConnectionCacheCallbackFlag() throws SQLException {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public CLOB createClob(byte[] paramArrayOfByte) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CLOB createClob(byte[] paramArrayOfByte, short paramShort) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BLOB createBlob(byte[] paramArrayOfByte) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BFILE createBfile(byte[] paramArrayOfByte) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isDescriptorSharable(OracleConnection paramOracleConnection) throws SQLException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isV8Compatible() throws SQLException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public OracleStatement refCursorCursorToStatement(int paramInt) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void abort() throws SQLException {
        // TODO Auto-generated method stub

    }

    @Override
    public XAResource getXAResource() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

}
