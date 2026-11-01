package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gzy {
    public final java.lang.Object a;
    public final java.lang.Throwable b;

    public gzy(java.lang.Object obj) {
        this.a = obj;
        this.b = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gzy) {
            defpackage.gzy gzyVar = (defpackage.gzy) obj;
            java.lang.Object obj2 = this.a;
            if (obj2 != null && obj2.equals(gzyVar.a)) {
                return true;
            }
            java.lang.Throwable th = this.b;
            if (th != null && gzyVar.b != null) {
                return th.toString().equals(th.toString());
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, this.b});
    }

    public gzy(java.lang.Throwable th) {
        this.b = th;
        this.a = null;
    }
}
