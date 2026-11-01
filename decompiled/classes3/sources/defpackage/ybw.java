package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ybw implements defpackage.xuu {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public ybw(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, xxm] */
    @Override // defpackage.xuu
    public final /* synthetic */ defpackage.xxe a(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        int i3 = this.$cid;
        boolean z = false;
        if (i3 == 0) {
            defpackage.ybh ybhVar = (defpackage.ybh) this.a;
            return ybhVar.a(new defpackage.ybs((android.os.ParcelFileDescriptor) obj, ybhVar.h, ybhVar.i, 0), i, i2, xusVar, defpackage.ybh.g);
        }
        if (i3 != 1) {
            if (i3 != 2) {
                return i3 != 3 ? defpackage.ybv.g(((defpackage.xth) obj).a(), this.a) : defpackage.uyg.k(android.graphics.ImageDecoder.createSource(defpackage.yfp.a((java.io.InputStream) obj, false)), i, i2, xusVar);
            }
            return defpackage.uyg.k(android.graphics.ImageDecoder.createSource((java.nio.ByteBuffer) obj), i, i2, xusVar);
        }
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
        defpackage.ybh ybhVar2 = (defpackage.ybh) this.a;
        xtq xtqVar = ybhVar2.j;
        if (xtqVar != null && xtqVar.a(defpackage.xrv.class)) {
            z = true;
        }
        return ybhVar2.a(new defpackage.ybr(byteBuffer, ybhVar2.h, ybhVar2.i, z), i, i2, xusVar, defpackage.ybh.g);
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.xuu
    public final /* synthetic */ boolean b(java.lang.Object obj, defpackage.xus xusVar) {
        int i = this.$cid;
        if (i == 0) {
            return (!("HUAWEI".equalsIgnoreCase(android.os.Build.MANUFACTURER) || "HONOR".equalsIgnoreCase(android.os.Build.MANUFACTURER)) || ((android.os.ParcelFileDescriptor) obj).getStatSize() <= 536870912) && defpackage.xvp.d();
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return defpackage.uyg.l(defpackage.xff.B(((defpackage.uyg) this.a).b, (java.nio.ByteBuffer) obj));
        }
        if (i != 3) {
            return true;
        }
        defpackage.uyg uygVar = (defpackage.uyg) this.a;
        return defpackage.uyg.l(defpackage.xff.G(uygVar.b, (java.io.InputStream) obj, (defpackage.xxt) uygVar.a));
    }
}
