package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vtz {
    public final java.lang.CharSequence a;
    public final int b;
    private final boolean c;

    public vtz(java.lang.CharSequence charSequence, int i, boolean z) {
        this.a = charSequence;
        this.b = i;
        this.c = z;
    }

    public static defpackage.vty a() {
        defpackage.vty vtyVar = new defpackage.vty();
        vtyVar.b(false);
        return vtyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vtz) {
            defpackage.vtz vtzVar = (defpackage.vtz) obj;
            if (this.a.equals(vtzVar.a)) {
                int i = this.b;
                int i2 = vtzVar.b;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.c == vtzVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.b;
        anty.aJ(i);
        return (((iHashCode * 1000003) ^ i) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.b;
        java.lang.String strValueOf = java.lang.String.valueOf(this.a);
        if (i == 1) {
            str = "ACCEPT_TOS";
        } else if (i == 2) {
            str = "DECLINE_TOS";
        } else if (i != 3) {
            str = i != 4 ? "null" : "DECLINE_TRANSCRIPTION";
        } else {
            str = "ACCEPT_TRANSCRIPTION";
        }
        return "Action{text=" + strValueOf + ", actionId=" + str + ", isRaised=" + this.c + '}';
    }

    public vtz() {
        throw null;
    }
}
