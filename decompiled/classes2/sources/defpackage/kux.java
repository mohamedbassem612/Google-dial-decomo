package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kux {
    public static final defpackage.kux a;
    public static final defpackage.kux b;
    public final int c;
    private final java.lang.String d;

    static {
        aeuh aeuhVar = new aeuh((byte[]) null);
        aeuhVar.c = "starting_voice-";
        aeuhVar.f(2132017766);
        a = aeuhVar.e();
        aeuh aeuhVar2 = new aeuh((byte[]) null);
        aeuhVar2.c = "ending_voice-";
        aeuhVar2.f(2132017756);
        b = aeuhVar2.e();
    }

    public kux(java.lang.String str, int i) {
        this.d = str;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.kux) {
            defpackage.kux kuxVar = (defpackage.kux) obj;
            if (this.d.equals(kuxVar.d) && this.c == kuxVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.d.hashCode() ^ 1000003) * 1000003) ^ this.c;
    }

    public final java.lang.String toString() {
        return "AudioFileInfo{fileNamePrefix=" + this.d + ", speechTextRes=" + this.c + '}';
    }

    public kux() {
        throw null;
    }
}
