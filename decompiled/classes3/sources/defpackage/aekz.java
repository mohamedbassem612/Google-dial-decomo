package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aekz implements defpackage.xzp {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;

    public aekz(android.content.Context context, int i) {
        this.$cid = i;
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.xzp
    public final /* synthetic */ boolean a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return xtq.Q(((defpackage.aelb) obj).b);
        }
        if (i != 1) {
            if (i != 2) {
                return ((defpackage.agqu) obj).b().j.equals("google");
            }
            if ((((defpackage.agqt) obj).b().b & 32) == 0) {
                return false;
            }
        } else if (((defpackage.aelb) obj).b.c == null) {
            return false;
        }
        return true;
    }

    @Override // defpackage.xzp
    public final /* synthetic */ ucm b(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        int i3 = this.$cid;
        if (i3 == 0) {
            defpackage.aelb aelbVar = (defpackage.aelb) obj;
            ahvr.bN(i == i2, "Width and height must be the same");
            xtq xtqVar = new xtq(this.a);
            if (i == Integer.MIN_VALUE) {
                i = 120;
            }
            return new ucm(aelbVar, new defpackage.aela(xtqVar, aelbVar, i));
        }
        if (i3 != 1) {
            if (i3 != 2) {
                return new ucm((defpackage.agqu) obj, new defpackage.agqa(this));
            }
            return ((defpackage.xzu) this.a).a(java.lang.String.class, java.io.InputStream.class).b(((defpackage.agqt) obj).b().h, i, i2, xusVar);
        }
        java.lang.String str = ((defpackage.aelb) obj).b.c;
        ahvr.ci(str);
        return ((defpackage.xzu) this.a).a(java.lang.String.class, java.io.InputStream.class).b(str, i, i2, xusVar);
    }

    public aekz(defpackage.xzu xzuVar, int i) {
        this.$cid = i;
        this.a = xzuVar;
    }

    public aekz(android.content.Context context, int i, byte[] bArr) {
        this.$cid = i;
        this.a = context;
    }
}
