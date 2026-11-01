package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class afjj {
    public final java.lang.String a;
    public final afjk b;
    private final java.lang.String c;

    public afjj(java.lang.String str, java.lang.String str2, afjk afjkVar) {
        this.a = str;
        this.c = str2;
        this.b = afjkVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.afjj) {
            defpackage.afjj afjjVar = (defpackage.afjj) obj;
            if (this.a.equals(afjjVar.a) && this.c.equals(afjjVar.c) && this.b.equals(afjjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "SurveyInternalEvent{sessionId=" + this.a + ", triggerId=" + this.c + ", surveyStyle=" + java.lang.String.valueOf(this.b) + '}';
    }

    public afjj() {
        throw null;
    }
}
