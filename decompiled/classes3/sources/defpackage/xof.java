package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class xof extends java.lang.Exception implements defpackage.xpa, defpackage.xjx {
    private final /* synthetic */ defpackage.xjx a;
    private final java.lang.String b;
    private final java.lang.Throwable d;
    private final java.lang.String f;

    public xof(defpackage.xjz xjzVar, java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.a = xjzVar.f();
        this.b = str;
        this.d = th;
        this.f = "SERVER";
    }

    @Override // defpackage.xhu
    public final defpackage.xhs asComponentRef() {
        throw null;
    }

    @Override // defpackage.xib
    public final defpackage.xhz asNodeRef() {
        return new defpackage.xia(this.a);
    }

    @Override // defpackage.xhx
    public final long d() {
        return ((defpackage.xjy) this.a).d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.xof) {
            defpackage.xof xofVar = (defpackage.xof) obj;
            if (aooh.n(xofVar.b, this.b) && aooh.n(aoil.a(xofVar.d), aoil.a(this.d)) && aooh.n(xofVar.f, this.f) && defpackage.xhp.j((defpackage.xjz) obj, this)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xjz
    public final defpackage.xjx f() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        return this.d;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getLocalizedMessage() {
        return "[" + identity() + "] " + super.getLocalizedMessage();
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.b;
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        return ((defpackage.xjy) this.a).a;
    }

    @Override // defpackage.xib
    public final java.lang.String getNodeName() {
        return ((defpackage.xjy) this.a).b;
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodePackage() {
        return defpackage.xhp.e(this.a);
    }

    @Override // defpackage.xhu
    public final java.lang.String getSubcomponent() {
        throw null;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, aoil.a(this.d), this.f, java.lang.Integer.valueOf(defpackage.xhp.i(this))});
    }

    @Override // defpackage.xjz, defpackage.xib, defpackage.xhu
    public final java.lang.String identity() {
        return defpackage.xfh.a(this.a);
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        byte[] bArrY;
        android.os.PersistableBundle persistableBundleN = defpackage.xhy.n(this);
        try {
            bArrY = aodc.y(this.d);
        } catch (java.lang.Throwable th) {
            bArrY = aodc.y(new java.lang.IllegalStateException("Cause (" + this.d.getMessage() + ") serialisation failed: " + th.getMessage()));
        }
        persistableBundleN.putString("MESSAGE", this.b);
        aooh.c(bArrY);
        java.util.ArrayList arrayList = new java.util.ArrayList(bArrY.length);
        for (byte b : bArrY) {
            arrayList.add(java.lang.Integer.valueOf(b));
        }
        persistableBundleN.putIntArray("CAUSE", ajsz.cm(arrayList));
        persistableBundleN.putString("TYPE", this.f);
        return persistableBundleN;
    }
}
