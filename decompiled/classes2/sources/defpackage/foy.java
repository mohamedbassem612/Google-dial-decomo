package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class foy implements defpackage.eqx {
    public final java.lang.String a;
    public final java.lang.String b;

    public foy(java.lang.String str, java.lang.String str2) {
        this.a = ahvr.q(str);
        this.b = str2;
    }

    @Override // defpackage.eqx
    public final /* synthetic */ defpackage.eqg a() {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.eqx
    public final void b(defpackage.eqv eqvVar) {
        java.lang.Integer numX;
        java.lang.Integer numX2;
        java.lang.Integer numX3;
        java.lang.Integer numX4;
        java.lang.String str = this.a;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (numX = aiql.X(this.b)) != null) {
                    eqvVar.i = numX;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS") && (numX2 = aiql.X(this.b)) != null) {
                    eqvVar.w = numX2;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (numX3 = aiql.X(this.b)) != null) {
                    eqvVar.h = numX3;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    eqvVar.c = this.b;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    eqvVar.x = this.b;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    eqvVar.a = this.b;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    eqvVar.e = this.b;
                }
                break;
            case 905239725:
                if (str.equals("DISCSUBTITLE")) {
                    eqvVar.u = this.b;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER") && (numX4 = aiql.X(this.b)) != null) {
                    eqvVar.v = numX4;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    eqvVar.d = this.b;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    eqvVar.b = this.b;
                }
                break;
        }
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
            defpackage.foy foyVar = (defpackage.foy) obj;
            if (this.a.equals(foyVar.a) && this.b.equals(foyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 527) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "VC: " + this.a + '=' + this.b;
    }
}
