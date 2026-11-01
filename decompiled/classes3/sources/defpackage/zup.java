package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class zup {
    public int a;
    final /* synthetic */ defpackage.zur b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final byte[] e;

    public zup(defpackage.zur zurVar, java.lang.String str, java.lang.String str2, byte[] bArr) {
        j$.util.Objects.requireNonNull(zurVar);
        this.b = zurVar;
        this.c = str;
        this.d = str2;
        this.e = bArr;
    }

    final ahrv a(defpackage.zuq zuqVar, java.lang.String str) {
        defpackage.zur.a.b().l("com/google/android/dialershared/wearabledatalayer/messageclient/sender/impl/DialerMessageSenderImpl$MessageSenderWithRetry", "executeWithRetry", 204, "DialerMessageSenderImpl.java").G("%s on try #%d", str, this.a);
        ahrv ahrvVarG = ahrv.g(aazc.e(zuqVar.a(this.c, this.d, this.e)));
        defpackage.ymu ymuVar = new defpackage.ymu(5);
        ajct ajctVar = this.b.c;
        return ahrvVarG.h(ymuVar, ajctVar).f(java.lang.Throwable.class, new defpackage.zum(this, zuqVar, str, 3), ajctVar);
    }
}
