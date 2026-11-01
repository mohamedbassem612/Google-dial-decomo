package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zhy {
    public final java.lang.Object a;
    private final defpackage.zhz b;

    public zhy(java.lang.Object obj, defpackage.zhz zhzVar) {
        this.a = obj;
        this.b = zhzVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.zhy) {
            defpackage.zhy zhyVar = (defpackage.zhy) obj;
            if (this.a.equals(zhyVar.a) && this.b.equals(zhyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() ^ (-721379959)) * 1000003) ^ 1) * 1000003) ^ this.b.hashCode()) * 1000003;
    }

    public final java.lang.String toString() {
        return "Event{code=null, payload=" + this.a.toString() + ", priority=DEFAULT, productData=" + this.b.toString() + ", eventContext=null}";
    }

    public zhy() {
        throw null;
    }
}
