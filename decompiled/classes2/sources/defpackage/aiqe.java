package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiqe extends java.util.logging.LogRecord {
    private static final java.lang.Object[] b;
    public final aipi a;
    private final aiom c;

    static {
        new defpackage.aiqd();
        b = new java.lang.Object[0];
    }

    protected aiqe(aiom aiomVar, aior aiorVar) {
        super(aiomVar.r(), null);
        this.c = aiomVar;
        this.a = aipi.g(aiorVar, aiomVar.n());
        ainh ainhVarF = aiomVar.f();
        setSourceClassName(ainhVarF.b());
        setSourceMethodName(ainhVarF.d());
        setLoggerName(aiomVar.q());
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
        setMillis(aiomVar.e() / 1000000);
        super.setParameters(b);
    }

    private static void a(aiom aiomVar, java.lang.StringBuilder sb) {
        sb.append("  original message: ");
        if (aiomVar.o() == null) {
            sb.append(aiop.b(aiomVar.p()));
        } else {
            sb.append(aiomVar.o().b);
            sb.append("\n  original arguments:");
            for (java.lang.Object obj : aiomVar.V()) {
                sb.append("\n    ");
                sb.append(aiop.b(obj));
            }
        }
        aior aiorVarN = aiomVar.n();
        if (aiorVarN.b() > 0) {
            sb.append("\n  metadata:");
            for (int i = 0; i < aiorVarN.b(); i++) {
                sb.append("\n    ");
                sb.append(aiorVarN.c(i).a);
                sb.append(": ");
                sb.append(aiop.b(aiorVarN.e(i)));
            }
        }
        sb.append("\n  level: ");
        sb.append(aiop.b(aiomVar.r()));
        sb.append("\n  timestamp (nanos): ");
        sb.append(aiomVar.e());
        sb.append("\n  class: ");
        sb.append(aiomVar.f().b());
        sb.append("\n  method: ");
        sb.append(aiomVar.f().d());
        sb.append("\n  line number: ");
        sb.append(aiomVar.f().a());
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Set] */
    @Override // java.util.logging.LogRecord
    public final java.lang.String getMessage() {
        java.lang.String message = super.getMessage();
        if (message == null) {
            aiom aiomVar = this.c;
            aipi aipiVar = this.a;
            ajmk ajmkVar = aipm.a;
            if (aipm.b(aiomVar, aipiVar, (java.util.Set) ajmkVar.b)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                ajmkVar.a(aiomVar, aipiVar, sb);
                message = sb.toString();
            } else {
                message = aipm.a(aiomVar);
            }
            super.setMessage(message);
        }
        return message;
    }

    @Override // java.util.logging.LogRecord
    public final void setMessage(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        super.setMessage(str);
    }

    @Override // java.util.logging.LogRecord
    public final void setParameters(java.lang.Object[] objArr) {
        getMessage();
        if (objArr == null) {
            objArr = b;
        }
        super.setParameters(objArr);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" {\n  message: ");
        sb.append(getMessage());
        sb.append("\n  arguments: ");
        sb.append(getParameters() != null ? java.util.Arrays.asList(getParameters()) : "<none>");
        sb.append('\n');
        a(this.c, sb);
        sb.append("\n}");
        return sb.toString();
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundle(java.util.ResourceBundle resourceBundle) {
    }

    @Override // java.util.logging.LogRecord
    public final void setResourceBundleName(java.lang.String str) {
    }

    protected aiqe(java.lang.RuntimeException runtimeException, aiom aiomVar, aior aiorVar) {
        this(aiomVar, aiorVar);
        setLevel(aiomVar.r().intValue() < java.util.logging.Level.WARNING.intValue() ? java.util.logging.Level.WARNING : aiomVar.r());
        setThrown(runtimeException);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LOGGING ERROR: ");
        sb.append(runtimeException.getMessage());
        sb.append('\n');
        a(aiomVar, sb);
        super.setMessage(sb.toString());
    }

    public aiqe(aiom aiomVar, aior aiorVar, byte[] bArr) {
        this(aiomVar, aiorVar);
        setThrown((java.lang.Throwable) this.a.b(ainc.a));
        getMessage();
    }
}
