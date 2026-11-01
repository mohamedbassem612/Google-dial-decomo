package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hpn implements defpackage.hhl {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public hpn(aonj aonjVar, aomy aomyVar, int i) {
        this.$cid = i;
        this.a = aonjVar;
        this.b = aomyVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aonj, java.lang.Object] */
    @Override // defpackage.hhl
    public final void a(int i) {
        java.lang.Character ch;
        if (this.$cid == 0) {
            switch (i) {
                case 0:
                    ch = '0';
                    break;
                case 1:
                    ch = '1';
                    break;
                case 2:
                    ch = '2';
                    break;
                case 3:
                    ch = '3';
                    break;
                case 4:
                    ch = '4';
                    break;
                case 5:
                    ch = '5';
                    break;
                case 6:
                    ch = '6';
                    break;
                case 7:
                    ch = '7';
                    break;
                case 8:
                    ch = '8';
                    break;
                case 9:
                    ch = '9';
                    break;
                case 10:
                    ch = '*';
                    break;
                case 11:
                    ch = '#';
                    break;
                default:
                    ch = null;
                    break;
            }
            if (ch != null) {
                ?? r1 = this.a;
                ch.charValue();
                r1.a(ch);
            }
        }
    }

    @Override // defpackage.hhl
    public final void b(int i) {
        if (this.$cid != 0) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            java.util.Map map = ((defpackage.hmx) this.b).d;
            if (map.containsKey(numValueOf)) {
                defpackage.hmy hmyVar = (defpackage.hmy) this.a;
                java.lang.String strSubstring = hmyVar.a;
                if (strSubstring == null) {
                    strSubstring = "";
                }
                if (i != 0) {
                    throw new java.lang.IllegalArgumentException(a.bj(i, "Invalid key: "));
                }
                if (aoov.K(strSubstring, '0')) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                    aooh.e(strSubstring, "substring(...)");
                }
                defpackage.hhs hhsVar = hmyVar.b;
                java.lang.Object obj = map.get(numValueOf);
                java.util.Objects.toString(obj);
                hhsVar.a(java.lang.String.valueOf(strSubstring).concat(java.lang.String.valueOf(obj)));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aomy, java.lang.Object] */
    @Override // defpackage.hhl
    public final void c() {
        if (this.$cid == 0) {
            this.b.a();
        }
    }

    public hpn(defpackage.hmx hmxVar, defpackage.hmy hmyVar, int i) {
        this.$cid = i;
        this.b = hmxVar;
        this.a = hmyVar;
    }
}
