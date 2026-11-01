package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajsn implements ajfb {
    private static final byte[] e = {0};
    public final defpackage.ajoc a;
    public final int b;
    public final byte[] c;
    public final byte[] d;

    public ajsn(ajnn ajnnVar) {
        java.lang.String strValueOf = java.lang.String.valueOf(java.lang.String.valueOf(ajnnVar.a.d));
        this.a = new defpackage.ajsm("HMAC".concat(strValueOf), new javax.crypto.spec.SecretKeySpec(ajnnVar.d.k(), "HMAC"));
        this.b = ajnnVar.a.b;
        this.c = ajnnVar.b.c();
        if (ajnnVar.a.c.equals(ajnq.c)) {
            this.d = java.util.Arrays.copyOf(e, 1);
        } else {
            this.d = new byte[0];
        }
    }

    public ajsn(ajng ajngVar) {
        this.a = defpackage.ajsk.b(defpackage.ajoa.ap(defpackage.ajob.c(ajngVar.a.a), ajngVar.d));
        this.b = ajngVar.a.b;
        this.c = ajngVar.b.c();
        if (ajngVar.a.c.equals(ajnj.c)) {
            this.d = java.util.Arrays.copyOf(e, 1);
        } else {
            this.d = new byte[0];
        }
    }

    public ajsn(defpackage.ajoc ajocVar, int i) {
        this.a = ajocVar;
        this.b = i;
        this.c = new byte[0];
        this.d = new byte[0];
        ajocVar.a(new byte[0], i);
    }
}
