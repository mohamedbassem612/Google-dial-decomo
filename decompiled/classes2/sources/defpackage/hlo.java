package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hlo implements defpackage.hqr {
    public final defpackage.hqe a;
    public final ahpz b;
    public final rlv c;
    public final zjm d;
    private final android.content.Context e;
    private final ssq f;
    private final gpd g;

    public hlo(android.content.Context context, aazc aazcVar, ssq ssqVar, defpackage.hqe hqeVar, ahpz ahpzVar, rlv rlvVar, gpd gpdVar, zjm zjmVar) {
        aooh.f(context, "appContext");
        aooh.f(aazcVar, "clock");
        aooh.f(ssqVar, "phoneNumberHelper");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        this.e = context;
        this.f = ssqVar;
        this.a = hqeVar;
        this.b = ahpzVar;
        this.c = rlvVar;
        this.g = gpdVar;
        this.d = zjmVar;
    }

    public static final defpackage.ze e() {
        defpackage.ys ysVar = new defpackage.ys();
        ysVar.b();
        return ysVar.a();
    }

    @Override // defpackage.hqw
    public final defpackage.ze a() {
        return e();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:42:0x00eb  */
    @Override // defpackage.hqr
    public final /* synthetic */ java.lang.Object b(java.lang.Object obj, defpackage.tt ttVar, aoln aolnVar) throws aois {
        java.lang.Object objA;
        java.lang.String str;
        java.lang.String str2;
        defpackage.hlu hluVar;
        defpackage.hlp hlpVar = (defpackage.hlp) obj;
        if (!(hlpVar instanceof defpackage.hlp)) {
            throw new aois();
        }
        java.util.List<defpackage.hlt> list = hlpVar.a;
        if (list.isEmpty()) {
            objA = new defpackage.xo(androidx.car.app.model.CarText.create(dvx.e(this.e, 2132018537))).a();
        } else {
            defpackage.ys ysVar = new defpackage.ys();
            defpackage.yi yiVar = new defpackage.yi();
            for (defpackage.hlt hltVar : list) {
                defpackage.yh yhVar = new defpackage.yh();
                java.lang.CharSequence charSequenceA = hltVar.h;
                if ((charSequenceA == null || aoov.H(charSequenceA)) && ((charSequenceA = hltVar.e.a) == null || aoov.H(charSequenceA))) {
                    ssq ssqVar = this.f;
                    defpackage.hkd hkdVar = hltVar.d;
                    if (hkdVar != null) {
                        str2 = hkdVar.c;
                        str = hkdVar.d;
                    } else {
                        str = null;
                        str2 = null;
                    }
                    charSequenceA = ssqVar.a(str2, str);
                    if (charSequenceA == null) {
                        throw new java.lang.IllegalStateException("Required value was null.");
                    }
                }
                int i = hltVar.j;
                if (i > 1) {
                    charSequenceA = ((java.lang.Object) charSequenceA) + " (" + i + ')';
                }
                yhVar.f(charSequenceA);
                android.content.Context context = this.e;
                defpackage.hmh hmhVar = hltVar.e;
                java.lang.CharSequence charSequenceR = defpackage.hgu.r(context, j$.time.Instant.now().toEpochMilli(), hltVar.a.toEpochMilli(), true);
                aooh.e(charSequenceR, "newCallLogTimestampLabel(...)");
                java.lang.String str3 = hltVar.i;
                if (str3 != null && !aoov.H(str3)) {
                    charSequenceR = str3;
                }
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                int i2 = hltVar.c;
                if (i2 == 1) {
                    androidx.car.app.model.CarColor carColor = androidx.car.app.model.CarColor.GREEN;
                    aooh.e(carColor, "GREEN");
                    hluVar = new defpackage.hlu(2131231344, carColor);
                } else if (i2 == 2) {
                    androidx.car.app.model.CarColor carColor2 = androidx.car.app.model.CarColor.GREEN;
                    aooh.e(carColor2, "GREEN");
                    hluVar = new defpackage.hlu(2131231341, carColor2);
                } else if (i2 == 3) {
                    androidx.car.app.model.CarColor carColor3 = androidx.car.app.model.CarColor.RED;
                    aooh.e(carColor3, "RED");
                    hluVar = new defpackage.hlu(2131231343, carColor3);
                } else if (i2 == 4) {
                    androidx.car.app.model.CarColor carColor4 = androidx.car.app.model.CarColor.BLUE;
                    aooh.e(carColor4, "BLUE");
                    hluVar = new defpackage.hlu(2131231667, carColor4);
                } else if (i2 != 5) {
                    hluVar = null;
                } else {
                    androidx.car.app.model.CarColor carColor5 = androidx.car.app.model.CarColor.RED;
                    aooh.e(carColor5, "RED");
                    hluVar = new defpackage.hlu(2131231343, carColor5);
                }
                if (hluVar != null) {
                    spannableStringBuilder.append("  ", androidx.car.app.model.CarIconSpan.create(androidx.car.app.model.CarIcon.createTintedIcon(androidx.core.graphics.drawable.IconCompat.g(context, hluVar.a), hluVar.b), 2), 33);
                }
                java.util.Objects.toString(charSequenceR);
                spannableStringBuilder.append((java.lang.CharSequence) " ".concat(java.lang.String.valueOf(charSequenceR)));
                yhVar.c(new android.text.SpannedString(spannableStringBuilder));
                yhVar.e(new defpackage.hms(this, hltVar, ttVar, 1, null));
                aimz aimzVar = com.android.dialer.androidauto.impl.caricons.CarIconContentProvider.a;
                akzx akzxVarM = abwd.a.m();
                defpackage.hkd hkdVar2 = hltVar.d;
                java.lang.String str4 = hkdVar2 != null ? hkdVar2.c : null;
                if (str4 == null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                akzxVarM.u();
                abwd abwdVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(str4);
                abwdVar.b |= 2;
                abwdVar.d = str4;
                java.lang.String str5 = hmhVar.a;
                akzxVarM.u();
                abwd abwdVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str5);
                abwdVar2.b |= 1;
                abwdVar2.c = str5;
                java.lang.String str6 = hmhVar.b;
                akzxVarM.u();
                abwd abwdVar3 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str6);
                abwdVar3.b |= 4;
                abwdVar3.e = str6;
                long j = hmhVar.c;
                akzxVarM.u();
                abwd abwdVar4 = akzxVarM.b;
                abwdVar4.b |= 8;
                abwdVar4.f = j;
                java.lang.String str7 = hmhVar.d;
                akzxVarM.u();
                abwd abwdVar5 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str7);
                abwdVar5.b |= 16;
                abwdVar5.g = str7;
                boolean z = hltVar.f || hltVar.g;
                akzxVarM.u();
                abwd abwdVar6 = akzxVarM.b;
                abwdVar6.b |= 256;
                abwdVar6.k = z;
                abwd abwdVarP = akzxVarM.p();
                aooh.e(abwdVarP, "build(...)");
                yhVar.d(kcq.M(ttVar, abwdVarP, ttVar.getResources().getDimensionPixelSize(2131167329), ttVar.getResources().getDimensionPixelSize(2131167329)), 2);
                yiVar.d.add(yhVar.a());
            }
            ysVar.a = ajsz.aY(yiVar.a());
            objA = ysVar.a();
        }
        d(mce.gu);
        return objA;
    }

    @Override // defpackage.hqw
    public final /* synthetic */ aoxh c(aoxh aoxhVar, defpackage.tt ttVar) {
        return defpackage.hhv.a(this, aoxhVar, ttVar);
    }

    public final void d(mce mceVar) {
        this.g.i((java.lang.String) null).b(mceVar);
    }
}
