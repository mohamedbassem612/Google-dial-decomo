package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aprc {
    public long a;

    public final void a() {
        this.a++;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.aprc) && this.a == ((defpackage.aprc) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Long.valueOf(this.a)});
    }

    public final java.lang.String toString() {
        return java.lang.Long.toString(this.a);
    }
}
