package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class akbl implements aonj {
    public final /* synthetic */ ajyx a;
    public final /* synthetic */ defpackage.akbm b;
    public final /* synthetic */ akbn c;

    public /* synthetic */ akbl(ajyx ajyxVar, defpackage.akbm akbmVar, akbn akbnVar) {
        this.a = ajyxVar;
        this.b = akbmVar;
        this.c = akbnVar;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        android.content.Context context;
        java.net.URI uri;
        java.util.concurrent.Executor executor;
        java.util.concurrent.Executor executor2;
        java.util.concurrent.Executor executor3;
        ahzi ahziVar;
        akcg akcgVar;
        aooh.f((defpackage.akbm) obj, "it");
        long j = ajzw.a;
        ahzi fedVar = new fed(18);
        defpackage.ajzv ajzvVar = new defpackage.ajzv();
        ajzvVar.d(fedVar);
        ajzvVar.c(4194304);
        ajzvVar.a(Long.MAX_VALUE);
        ajzvVar.b(ajzw.a);
        ajzvVar.e(akcg.a);
        ajyx ajyxVar = this.a;
        android.content.Context context2 = ajyxVar.a;
        if (context2 == null) {
            throw new java.lang.NullPointerException("Null applicationContext");
        }
        defpackage.akbm akbmVar = this.b;
        ajzvVar.a = context2;
        ajzvVar.b = akbmVar.a;
        ajzvVar.i = akbmVar.c;
        ajzvVar.j = akbmVar.d;
        ajzvVar.k = akbmVar.b;
        ajzvVar.p = (byte) (ajzvVar.p | 1);
        java.util.concurrent.Executor executor4 = ajyxVar.d;
        if (executor4 == null) {
            throw new java.lang.NullPointerException("Null backgroundExecutor");
        }
        ajzvVar.c = executor4;
        java.util.concurrent.Executor executor5 = ajyxVar.e;
        if (executor5 == null) {
            throw new java.lang.NullPointerException("Null blockingExecutor");
        }
        ajzvVar.d = executor5;
        java.util.concurrent.Executor executor6 = ajyxVar.c;
        if (executor6 == null) {
            throw new java.lang.NullPointerException("Null lightweightExecutor");
        }
        akbn akbnVar = this.c;
        ajzvVar.e = executor6;
        ajzvVar.f = ajyxVar.f;
        ajzvVar.g = ajyxVar.h;
        ajzvVar.d(ajyxVar.i);
        ajzvVar.a(ajyxVar.l);
        ajzvVar.b(ajyxVar.m);
        ajzvVar.e(akbnVar.a);
        java.lang.Integer num = akbmVar.e;
        if (num != null) {
            ajzvVar.c(num.intValue());
        } else {
            ajzvVar.c(ajyxVar.k);
        }
        ajzx ajzxVar = ajyxVar.b;
        if (ajzvVar.p == 15 && (context = ajzvVar.a) != null && (uri = ajzvVar.b) != null && (executor = ajzvVar.c) != null && (executor2 = ajzvVar.d) != null && (executor3 = ajzvVar.e) != null && (ahziVar = ajzvVar.h) != null && (akcgVar = ajzvVar.o) != null) {
            return new defpackage.akbk(ajzxVar, new ajzw(context, uri, executor, executor2, executor3, ajzvVar.f, ajzvVar.g, ahziVar, ajzvVar.i, ajzvVar.j, ajzvVar.k, ajzvVar.l, ajzvVar.m, ajzvVar.n, akcgVar));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (ajzvVar.a == null) {
            sb.append(" applicationContext");
        }
        if (ajzvVar.b == null) {
            sb.append(" uri");
        }
        if (ajzvVar.c == null) {
            sb.append(" backgroundExecutor");
        }
        if (ajzvVar.d == null) {
            sb.append(" blockingExecutor");
        }
        if (ajzvVar.e == null) {
            sb.append(" lightweightExecutor");
        }
        if (ajzvVar.h == null) {
            sb.append(" recordNetworkMetricsToPrimes");
        }
        if ((ajzvVar.p & 1) == 0) {
            sb.append(" grpcIdleTimeoutMillis");
        }
        if ((ajzvVar.p & 2) == 0) {
            sb.append(" maxMessageSize");
        }
        if ((ajzvVar.p & 4) == 0) {
            sb.append(" grpcKeepAliveTimeMillis");
        }
        if ((ajzvVar.p & 8) == 0) {
            sb.append(" grpcKeepAliveTimeoutMillis");
        }
        if (ajzvVar.o == null) {
            sb.append(" streamzWrapper");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
