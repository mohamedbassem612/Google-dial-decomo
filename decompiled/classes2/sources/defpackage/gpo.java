package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gpo {
    public final defpackage.gnn a;
    public final defpackage.gnn b;
    public final gpl c;
    private final android.os.IBinder d;
    private final androidx.window.extensions.embedding.SplitInfo.Token e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gpo(defpackage.gnn gnnVar, defpackage.gnn gnnVar2, gpl gplVar, android.os.IBinder iBinder) {
        this(gnnVar, gnnVar2, gplVar, iBinder, null);
        aooh.f(iBinder, "binder");
        gms gmsVar = new gms();
        aopq aopqVar = new aopq(3, 4);
        int i = ((aopo) aopqVar).a;
        int i2 = ((aopo) aopqVar).b;
        int i3 = gmsVar.a;
        if (i > i3 || i3 > i2) {
            throw new java.lang.UnsupportedOperationException("This API requires extension version " + aopqVar + ", but the device is on " + i3);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gpo) {
            defpackage.gpo gpoVar = (defpackage.gpo) obj;
            if (aooh.n(this.a, gpoVar.a) && aooh.n(this.b, gpoVar.b) && aooh.n(this.c, gpoVar.c) && aooh.n(this.e, gpoVar.e) && aooh.n(this.d, gpoVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        androidx.window.extensions.embedding.SplitInfo.Token token = this.e;
        int iHashCode2 = ((iHashCode * 31) + (token != null ? token.hashCode() : 0)) * 31;
        android.os.IBinder iBinder = this.d;
        return iHashCode2 + (iBinder != null ? iBinder.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SplitInfo:{");
        sb.append("primaryActivityStack=" + this.a + ", ");
        sb.append("secondaryActivityStack=" + this.b + ", ");
        sb.append("splitAttributes=" + this.c + ", ");
        androidx.window.extensions.embedding.SplitInfo.Token token = this.e;
        if (token != null) {
            java.util.Objects.toString(token);
            sb.append("token=".concat(token.toString()));
        }
        android.os.IBinder iBinder = this.d;
        if (iBinder != null) {
            java.util.Objects.toString(iBinder);
            sb.append("binder=".concat(iBinder.toString()));
        }
        sb.append('}');
        return sb.toString();
    }

    public gpo(defpackage.gnn gnnVar, defpackage.gnn gnnVar2, gpl gplVar, android.os.IBinder iBinder, androidx.window.extensions.embedding.SplitInfo.Token token) {
        this.a = gnnVar;
        this.b = gnnVar2;
        this.c = gplVar;
        this.d = iBinder;
        this.e = token;
    }
}
