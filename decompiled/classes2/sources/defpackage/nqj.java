package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nqj {
    public akzb a;
    public java.lang.String b;
    public long c;
    public defpackage.nsk d;
    public boolean e;
    public int f;

    public /* synthetic */ nqj(java.lang.String str, int i) {
        akzb akzbVar;
        if ((i & 1) != 0) {
            akzc akzcVar = akzc.d;
            akzbVar = new akzb(128);
        } else {
            akzbVar = null;
        }
        str = (i & 2) != 0 ? "" : str;
        aooh.f(akzbVar, "audioByteString");
        aooh.f(str, "wavAudioPath");
        this.a = akzbVar;
        this.b = str;
        this.c = 0L;
        this.d = null;
        this.e = false;
        this.f = 1;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.nqj) {
            defpackage.nqj nqjVar = (defpackage.nqj) obj;
            if (aooh.n(this.a, nqjVar.a) && aooh.n(this.b, nqjVar.b) && this.c == nqjVar.c && aooh.n(this.d, nqjVar.d) && this.e == nqjVar.e && this.f == nqjVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        int iM = anty.M(this.c);
        defpackage.nsk nskVar = this.d;
        return (((((((iHashCode * 31) + iM) * 31) + (nskVar == null ? 0 : nskVar.hashCode())) * 31) + anty.L(this.e)) * 31) + this.f;
    }

    public final java.lang.String toString() {
        return "SessionAudioInfo(audioByteString=" + this.a + ", wavAudioPath=" + this.b + ", audioFramesCount=" + this.c + ", audioFormat=" + this.d + ", sessionClosed=" + this.e + ", channelCount=" + this.f + ')';
    }

    public nqj() {
        this(null, 63);
    }
}
