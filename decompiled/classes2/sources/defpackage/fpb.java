package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fpb implements java.lang.Comparable {
    public final long a;
    public final long b;
    public final long c;

    public fpb(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return java.lang.Long.compare(this.a, ((defpackage.fpb) obj).a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.fpb) {
            defpackage.fpb fpbVar = (defpackage.fpb) obj;
            if (this.a == fpbVar.a && this.b == fpbVar.b && this.c == fpbVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Long.valueOf(this.a), java.lang.Long.valueOf(this.b), java.lang.Long.valueOf(this.c)});
    }
}
