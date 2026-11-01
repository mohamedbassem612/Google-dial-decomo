package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class xsy implements java.lang.Cloneable {
    public defpackage.yfj a = defpackage.yfg.b;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.xsy clone() {
        try {
            return (defpackage.xsy) super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.xsy)) {
            return false;
        }
        defpackage.yfj yfjVar = this.a;
        defpackage.yfj yfjVar2 = ((defpackage.xsy) obj).a;
        char[] cArr = defpackage.ygc.a;
        return a.L(yfjVar, yfjVar2);
    }

    public final int hashCode() {
        defpackage.yfj yfjVar = this.a;
        if (yfjVar != null) {
            return yfjVar.hashCode();
        }
        return 0;
    }
}
