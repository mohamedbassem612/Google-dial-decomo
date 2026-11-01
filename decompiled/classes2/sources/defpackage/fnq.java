package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fnq implements defpackage.eqx {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public fnq(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    @Override // defpackage.eqx
    public final /* synthetic */ defpackage.eqg a() {
        return null;
    }

    @Override // defpackage.eqx
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fnq fnqVar = (defpackage.fnq) obj;
            if (this.a == fnqVar.a && this.b == fnqVar.b && this.c == fnqVar.c && this.d == fnqVar.d && this.e == fnqVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = anty.M(this.a) + 527;
        long j = this.e;
        long j2 = this.d;
        return (((((((iM * 31) + anty.M(this.b)) * 31) + anty.M(this.c)) * 31) + anty.M(j2)) * 31) + anty.M(j);
    }

    public final java.lang.String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }

    @Override // defpackage.eqx
    public final /* synthetic */ void b(defpackage.eqv eqvVar) {
    }
}
