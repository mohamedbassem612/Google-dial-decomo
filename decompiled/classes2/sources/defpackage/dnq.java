package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dnq implements defpackage.dmb {
    private final /* synthetic */ int $cid;
    public static final defpackage.dnq b = new defpackage.dnq(1);
    public static final defpackage.dnq a = new defpackage.dnq(0);

    private dnq(int i) {
        this.$cid = i;
    }

    @Override // defpackage.dmb
    public final android.graphics.Typeface a(android.content.Context context, dmc dmcVar) {
        android.graphics.Typeface typefaceM;
        android.graphics.Typeface typefaceM2;
        if (this.$cid == 0) {
            java.util.Objects.toString(dmcVar);
            throw new java.lang.IllegalStateException("GoogleFont only support async loading: ".concat(java.lang.String.valueOf(dmcVar)));
        }
        android.graphics.Typeface typefaceI = null;
        defpackage.dmo dmoVar = dmcVar instanceof defpackage.dmo ? (defpackage.dmo) dmcVar : null;
        if (dmoVar == null) {
            return null;
        }
        java.lang.String str = dmq.a.f;
        java.lang.String str2 = dmoVar.c;
        dnd dndVar = dmoVar.d;
        if (aooh.n(str2, str)) {
            typefaceI = dfa.i(str, dndVar, 0);
        } else {
            java.lang.String str3 = dmq.b.f;
            if (aooh.n(str2, str3)) {
                typefaceI = dfa.i(str3, dndVar, 0);
            } else {
                java.lang.String str4 = dmq.c.f;
                if (aooh.n(str2, str4)) {
                    typefaceI = dfa.i(str4, dndVar, 0);
                } else {
                    java.lang.String str5 = dmq.d.f;
                    if (aooh.n(str2, str5)) {
                        typefaceI = dfa.i(str5, dndVar, 0);
                    } else if (str2.length() != 0) {
                        dnd dndVar2 = dnd.e;
                        if (aooh.n(dndVar, dndVar2) && (str2 == null || str2.length() == 0)) {
                            typefaceM = android.graphics.Typeface.DEFAULT;
                        } else if (aooh.n(dndVar, dnd.g) && (str2 == null || str2.length() == 0)) {
                            typefaceM = android.graphics.Typeface.DEFAULT_BOLD;
                        } else {
                            typefaceM = ft$.ExternalSyntheticApiModelOutline0.m(str2 == null ? android.graphics.Typeface.DEFAULT : android.graphics.Typeface.create(str2, 0), dndVar.h, false);
                        }
                        int i = dndVar.h;
                        if (!aooh.n(typefaceM, ft$.ExternalSyntheticApiModelOutline0.m(android.graphics.Typeface.DEFAULT, i, false))) {
                            if (aooh.n(dndVar, dndVar2)) {
                                typefaceM2 = android.graphics.Typeface.DEFAULT;
                            } else {
                                typefaceM2 = aooh.n(dndVar, dnd.g) ? android.graphics.Typeface.DEFAULT_BOLD : ft$.ExternalSyntheticApiModelOutline0.m(android.graphics.Typeface.DEFAULT, i, false);
                            }
                            if (!aooh.n(typefaceM, typefaceM2)) {
                                typefaceI = typefaceM;
                            }
                        }
                    }
                }
            }
        }
        dnb dnbVar = ((dmc) dmoVar).b;
        int i2 = dni.a;
        return dni.a(typefaceI, dnbVar, context);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0060  */
    /* JADX WARN: Code duplicated, block: B:14:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0065  */
    /* JADX WARN: Code duplicated, block: B:16:0x0067  */
    @Override // defpackage.dmb
    public final java.lang.Object b(android.content.Context context, dmc dmcVar, aoln aolnVar) throws android.os.RemoteException {
        int i;
        int i2;
        if (this.$cid != 0) {
            throw new java.lang.UnsupportedOperationException("All preloaded fonts are optional local.");
        }
        if (!(dmcVar instanceof defpackage.dno)) {
            throw new java.lang.IllegalArgumentException(a.bF((byte) 41, dmcVar, "Only GoogleFontImpl supported (actual "));
        }
        defpackage.dno dnoVar = (defpackage.dno) dmcVar;
        java.lang.String str = dnoVar.c;
        dnd dndVar = dnoVar.e;
        int i3 = dndVar.h;
        int i4 = dnoVar.f;
        java.lang.String str2 = "name=" + str + "&weight=" + i3 + "&italic=" + (a.x(0, 1) ? 1 : 0) + "&besteffort=true";
        defpackage.dnn dnnVar = dnoVar.d;
        dxj dxjVar = new dxj(str2, defpackage.yj.f(((dmc) dnoVar).b, context));
        int iA = dndVar.a(dnd.g) ^ (-1);
        int i5 = iA >>> 31;
        boolean zX = a.x(0, 1);
        if (zX) {
            if (iA < 0) {
                i2 = 3;
            } else {
                i5 = 0;
                if (zX) {
                    i2 = 2;
                } else if (i5 != 0) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            i = i2;
        } else if (zX) {
            i2 = 2;
            i = i2;
        } else if (i5 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        aosc aoscVar = new aosc(ajsz.ap(aolnVar), 1);
        aoscVar.z();
        defpackage.dnp dnpVar = new defpackage.dnp(aoscVar, dmcVar, context);
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = android.os.Looper.getMainLooper();
        }
        defpackage.dvm.j(context, vx.z(new java.lang.Object[]{dxjVar}), i, false, 0, ft$.ExternalSyntheticApiModelOutline0.m(looperMyLooper), dnpVar);
        return aoscVar.k();
    }
}
