package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bck extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ int a;
    final /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bck(bbh bbhVar, int i, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.b = bbhVar;
        this.a = i;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((asv) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((asv) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 4:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 5:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 6:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 7:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 8:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 9:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    public final java.lang.Object b(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                defpackage.bcl bclVar = (defpackage.bcl) this.b;
                afob afobVar = bclVar.o;
                int iB = afobVar.b();
                int i = this.a;
                if (iB != i || afobVar.c() != 0) {
                    bclVar.h.b();
                    defpackage.bbo bboVarK = bclVar.k();
                    if (true != (bboVarK instanceof bcv)) {
                        bboVarK = null;
                    }
                    if (bboVarK != null) {
                        bboVarK.a.c();
                    }
                }
                afobVar.f(i, 0);
                afobVar.c = null;
                dbk dbkVar = bclVar.n;
                if (dbkVar != null) {
                    dbkVar.C();
                }
                return aojh.a;
            case 1:
                aooc.af(obj);
                ((bbh) this.b).i(this.a, 0, true);
                return aojh.a;
            case 2:
                aooc.af(obj);
                ((defpackage.jif) this.b).g = this.a;
                return aojh.a;
            case 3:
                aooc.af(obj);
                ((defpackage.lrc) this.b).e = new java.lang.Integer(this.a);
                return aojh.a;
            case 4:
                aooc.af(obj);
                ((defpackage.lrc) this.b).d = new java.lang.Integer(this.a);
                return aojh.a;
            case 5:
                aooc.af(obj);
                defpackage.lrh lrhVar = (defpackage.lrh) this.b;
                j$.util.Optional optionalA = lrhVar.d.a();
                aooh.e(optionalA, "getCallAudioRoute(...)");
                java.lang.Double d = ajsz.cj(ajsz.bb(new zmw[]{zmw.c, zmw.b}), (zmw) aooh.q(optionalA)) ? (java.lang.Double) lrhVar.i.a() : (java.lang.Double) lrhVar.h.a();
                android.media.AudioManager audioManager = lrhVar.f;
                double streamMaxVolume = audioManager.getStreamMaxVolume(0);
                aooh.c(d);
                double dDoubleValue = streamMaxVolume * d.doubleValue();
                int i2 = this.a;
                int iH = aopc.h(dDoubleValue);
                if (i2 <= iH) {
                    return java.lang.Boolean.FALSE;
                }
                defpackage.lrh.a.b().l("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerAudioHapticsPlayer", "adjustStreamVolume$<anonymous>", 109, "ContactCheckerAudioHapticsPlayer.kt").y("setting reduced %f volume", d);
                audioManager.setStreamVolume(0, iH, 0);
                return java.lang.Boolean.TRUE;
            case 6:
                aooc.af(obj);
                return ((okj) this.b).m(this.a);
            case 7:
                aooc.af(obj);
                return ((okj) this.b).g(this.a);
            case 8:
                aooc.af(obj);
                oko okoVar = (oko) this.b;
                android.telephony.TelephonyManager telephonyManager = okoVar.j;
                int i3 = this.a;
                ac$.ExternalSyntheticApiModelOutline0.m(telephonyManager, i3);
                mgv mgvVar = mgv.bV;
                java.util.List listAY = ajsz.aY(gus.av(i3));
                android.telecom.PhoneAccountHandle phoneAccountHandle = okoVar.i;
                zjv.i(okoVar.g, mgvVar, listAY, gus.aw(aais.aH(phoneAccountHandle != null ? phoneAccountHandle.getId() : null)), 0, 24);
                return aojh.a;
            case 9:
                aooc.af(obj);
                return aooh.q(((oko) this.b).E(this.a));
            default:
                aooc.af(obj);
                int i4 = this.a;
                java.lang.Object obj2 = this.b;
                java.lang.Object objOrElse = ((oko) obj2).E(i4).orElse(obj2);
                aooh.e(objOrElse, "orElse(...)");
                return (oko) objOrElse;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.bck((defpackage.bcl) this.b, this.a, aolnVar, 0);
            case 1:
                return new defpackage.bck((bbh) this.b, this.a, aolnVar, 1);
            case 2:
                return new defpackage.bck((defpackage.jif) this.b, this.a, aolnVar, 2);
            case 3:
                return new defpackage.bck((defpackage.lrc) this.b, this.a, aolnVar, 3);
            case 4:
                return new defpackage.bck((defpackage.lrc) this.b, this.a, aolnVar, 4, (byte[]) null);
            case 5:
                return new defpackage.bck((defpackage.lrh) this.b, this.a, aolnVar, 5);
            case 6:
                return new defpackage.bck((okj) this.b, this.a, aolnVar, 6);
            case 7:
                return new defpackage.bck((okj) this.b, this.a, aolnVar, 7, (byte[]) null);
            case 8:
                return new defpackage.bck((oko) this.b, this.a, aolnVar, 8);
            case 9:
                return new defpackage.bck((oko) this.b, this.a, aolnVar, 9, (byte[]) null);
            default:
                return new defpackage.bck((oko) this.b, this.a, aolnVar, 10, (char[]) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bck(defpackage.bcl bclVar, int i, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.b = bclVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bck(defpackage.jif jifVar, int i, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.b = jifVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bck(defpackage.lrc lrcVar, int i, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.b = lrcVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bck(defpackage.lrc lrcVar, int i, aoln aolnVar, int i2, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i2;
        this.b = lrcVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bck(defpackage.lrh lrhVar, int i, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.b = lrhVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bck(okj okjVar, int i, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.b = okjVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bck(okj okjVar, int i, aoln aolnVar, int i2, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i2;
        this.b = okjVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bck(oko okoVar, int i, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.b = okoVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bck(oko okoVar, int i, aoln aolnVar, int i2, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i2;
        this.b = okoVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bck(oko okoVar, int i, aoln aolnVar, int i2, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i2;
        this.b = okoVar;
        this.a = i;
    }
}
