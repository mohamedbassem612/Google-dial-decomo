package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eyo {
    public final long a;
    public final float b;
    public final long c;

    public eyo(defpackage.eyn eynVar) {
        this.a = eynVar.a;
        this.b = eynVar.b;
        this.c = eynVar.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.eyo) {
            defpackage.eyo eyoVar = (defpackage.eyo) obj;
            if (this.a == eyoVar.a && this.b == eyoVar.b && this.c == eyoVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Long.valueOf(this.a), java.lang.Float.valueOf(this.b), java.lang.Long.valueOf(this.c)});
    }
}
