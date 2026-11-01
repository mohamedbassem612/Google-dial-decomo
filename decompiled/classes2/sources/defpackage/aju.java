package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class aju implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ aju(aoop aoopVar, defpackage.fxr fxrVar, defpackage.fwc fwcVar, android.os.Bundle bundle, int i) {
        this.$cid = i;
        this.d = aoopVar;
        this.c = fxrVar;
        this.a = fwcVar;
        this.b = bundle;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v13, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v31, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v33, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v35, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v37, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v39, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v47, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v49, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v51, types: [abwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v5, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [asv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [aonj, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        rke rkeVar;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                long jLongValue = ((java.lang.Long) obj).longValue();
                cer cerVar = (cer) this.a.a();
                long jLongValue2 = cerVar != null ? ((java.lang.Number) cerVar.a()).longValue() : jLongValue;
                ?? r12 = this.d;
                java.lang.Object obj2 = this.c;
                defpackage.ajw ajwVar = (defpackage.ajw) this.b;
                if (ajwVar.b == Long.MIN_VALUE || ((aooq) obj2).a != defpackage.wx.a(r12.c())) {
                    ajwVar.b = jLongValue;
                    cfc cfcVar = ajwVar.a;
                    java.lang.Object[] objArr = cfcVar.a;
                    int i = cfcVar.b;
                    for (int i2 = 0; i2 < i; i2++) {
                        ((defpackage.ajt) objArr[i2]).f = true;
                    }
                    ((aooq) obj2).a = defpackage.wx.a(r12.c());
                }
                float f = ((aooq) obj2).a;
                if (f == 0.0f) {
                    cfc cfcVar2 = ajwVar.a;
                    java.lang.Object[] objArr2 = cfcVar2.a;
                    int i3 = cfcVar2.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        defpackage.ajt ajtVar = (defpackage.ajt) objArr2[i4];
                        ajtVar.b(ajtVar.d.a);
                        ajtVar.f = true;
                    }
                } else {
                    float f2 = (jLongValue2 - ajwVar.b) / f;
                    cfc cfcVar3 = ajwVar.a;
                    java.lang.Object[] objArr3 = cfcVar3.a;
                    int i5 = cfcVar3.b;
                    boolean z2 = true;
                    for (int i6 = 0; i6 < i5; i6++) {
                        defpackage.ajt ajtVar2 = (defpackage.ajt) objArr3[i6];
                        boolean zA = ajtVar2.e;
                        if (!zA) {
                            long j = (long) f2;
                            ajtVar2.h.b(false);
                            if (ajtVar2.f) {
                                ajtVar2.f = false;
                                ajtVar2.g = j;
                            }
                            long j2 = j - ajtVar2.g;
                            ajtVar2.b(ajtVar2.d.c(j2));
                            zA = defpackage.wo.a(ajtVar2.d, j2);
                            ajtVar2.e = zA;
                        }
                        z2 &= zA;
                    }
                    ajwVar.c.b(java.lang.Boolean.valueOf(!z2));
                }
                return aojh.a;
            case 1:
                java.lang.Object obj3 = this.b;
                aii aiiVar = (aii) obj3;
                air airVar = aiiVar.b;
                defpackage.aip aipVar = (defpackage.aip) obj;
                defpackage.wx.f(aipVar, airVar);
                java.lang.Object objB = aiiVar.b(aipVar.a());
                boolean zN = aooh.n(objB, aipVar.a());
                ?? r5 = this.c;
                if (!zN) {
                    java.lang.Object obj4 = this.a;
                    airVar.c(objB);
                    ((air) obj4).c(objB);
                    if (r5 != 0) {
                        r5.a(obj3);
                    }
                    java.lang.Object obj5 = this.d;
                    aipVar.b();
                    ((aoop) obj5).a = true;
                } else if (r5 != 0) {
                    r5.a(obj3);
                }
                return aojh.a;
            case 2:
                defpackage.aip aipVar2 = (defpackage.aip) obj;
                float fFloatValue = ((java.lang.Number) aipVar2.a()).floatValue();
                aooq aooqVar = (aooq) this.c;
                float f3 = fFloatValue - aooqVar.a;
                float fA = this.a.a(f3);
                aooqVar.a = ((java.lang.Number) aipVar2.a()).floatValue();
                ((aooq) this.d).a = ((java.lang.Number) aipVar2.f.b.a(aipVar2.c)).floatValue();
                if (java.lang.Math.abs(f3 - fA) > 0.5f) {
                    aipVar2.b();
                }
                ((aqm) this.b).a++;
                return aojh.a;
            case 3:
                defpackage.aip aipVar3 = (defpackage.aip) obj;
                long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(((java.lang.Number) aipVar3.a()).floatValue());
                aoos aoosVar = (aoos) this.d;
                long jI = defpackage.asi.i(jFloatToRawIntBits, aoosVar.a);
                if (!defpackage.asi.h(jI)) {
                    if (!defpackage.asi.h(defpackage.asi.i(jI, ((defpackage.asi) this.b).l((apnt) this.a, jI)))) {
                        aipVar3.b();
                        return aojh.a;
                    }
                    aoosVar.a = defpackage.asi.k(aoosVar.a, jI);
                }
                if (((java.lang.Boolean) this.c.a(new defpackage.asw(aoosVar.a))).booleanValue()) {
                    aipVar3.b();
                }
                return aojh.a;
            case 4:
                defpackage.asi asiVar = (defpackage.asi) this.b;
                defpackage.asw aswVar = (defpackage.asw) obj;
                defpackage.ase aseVarG = defpackage.asi.g(asiVar.a);
                if (aseVarG != null) {
                    java.lang.Object obj6 = this.a;
                    java.lang.Object obj7 = this.c;
                    java.lang.Object obj8 = this.d;
                    asiVar.e(aseVarG);
                    aoot aootVar = (aoot) obj8;
                    aootVar.a = ((defpackage.ase) aootVar.a).a(aseVarG);
                    long jB = asiVar.b(((defpackage.ase) aootVar.a).a);
                    ((aoos) obj7).a = jB;
                    ((aoop) obj6).a = !defpackage.asi.h(defpackage.asi.i(jB, aswVar.a));
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 5:
                defpackage.fvs fvsVar = (defpackage.fvs) obj;
                aooh.f(fvsVar, "it");
                ((aoop) this.d).a = true;
                ((defpackage.fxr) this.c).i((defpackage.fwc) this.a, (android.os.Bundle) this.b, fvsVar, aokc.a);
                return aojh.a;
            case 6:
                return aazc.f((abwx) this.b, (java.util.List) this.a, (java.util.List) this.c, (java.util.List) this.d, (aoln) obj);
            case 7:
                return aazc.f((abwx) this.b, (java.util.List) this.a, (java.util.List) this.c, (java.util.List) this.d, (aoln) obj);
            case 8:
                return aazc.f((abwx) this.b, (java.util.List) this.a, (java.util.List) this.c, (java.util.List) this.d, (aoln) obj);
            case 9:
                return aazc.f((abwx) this.b, (java.util.List) this.a, (java.util.List) this.c, (java.util.List) this.d, (aoln) obj);
            case 10:
                return aazc.f((abwx) this.b, (java.util.List) this.a, (java.util.List) this.c, (java.util.List) this.d, (aoln) obj);
            case 11:
                java.lang.String str = (java.lang.String) obj;
                aooh.f(str, "it");
                if (((tin) this.c).t == 3) {
                    defpackage.djf djfVar = (defpackage.djf) this.a;
                    if (djfVar.a() > 0) {
                        djfVar.g(" • ");
                    }
                    android.content.Context context = (android.content.Context) this.b;
                    java.lang.CharSequence charSequenceAq = pez.aq(context, tiq.b((java.lang.String) this.d, str, context));
                    aooh.c(charSequenceAq);
                    djfVar.f(mni.ca(charSequenceAq));
                }
                return aojh.a;
            case 12:
                return aazc.f((abwx) this.b, (java.util.List) this.a, (java.util.List) this.c, (java.util.List) this.d, (aoln) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return aazc.f((abwx) this.b, (java.util.List) this.a, (java.util.List) this.c, (java.util.List) this.d, (aoln) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return aazc.f((abwx) this.b, (java.util.List) this.a, (java.util.List) this.c, (java.util.List) this.d, (aoln) obj);
            default:
                java.util.List list = (java.util.List) obj;
                aooh.c(list);
                aooh.f(list, "featureAndIntegrations");
                boolean zIsEmpty = list.isEmpty();
                java.lang.Object obj9 = this.c;
                if (zIsEmpty) {
                    rkeVar = null;
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ajsz.bv(arrayList, ((rjf) it.next()).b.g());
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        java.lang.String strF = ((rjf) it2.next()).b.f();
                        if (strF != null) {
                            arrayList2.add(strF);
                        }
                    }
                    rhx rhxVar = ((rkc) obj9).k;
                    java.lang.Object[] objArr4 = {pez.bj(arrayList2)};
                    android.content.Context context2 = (android.content.Context) rhxVar.a;
                    java.lang.String string = context2.getString(2132019146, objArr4);
                    aooh.e(string, "getString(...)");
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.util.Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        java.lang.String strD = ((rjf) it3.next()).b.d();
                        if (strD != null) {
                            arrayList3.add(strD);
                        }
                    }
                    java.lang.String string2 = context2.getString(2132019143, pez.bj(arrayList3));
                    aooh.e(string2, "getString(...)");
                    rkeVar = new rke(string, string2, arrayList);
                }
                if (rkeVar == null) {
                    rkc rkcVar = (rkc) obj9;
                    az azVarG = rkcVar.b.G();
                    if (azVarG != null) {
                        rkcVar.a(azVarG, 4);
                    }
                } else {
                    java.lang.Object obj10 = this.a;
                    java.lang.Object obj11 = this.d;
                    ((com.google.android.setupcompat.internal.TemplateLayout) obj11).j(aghr.class).b(rkeVar.a);
                    aooh.c(obj10);
                    aooh.f(obj10, "<this>");
                    com.google.android.setupdesign.view.InfoFooterView infoFooterViewFindViewById = ((android.view.View) obj10).findViewById(2131427534);
                    aooh.e(infoFooterViewFindViewById, "findViewById(...)");
                    com.google.android.setupdesign.view.InfoFooterView infoFooterView = infoFooterViewFindViewById;
                    java.lang.CharSequence charSequence = rkeVar.b;
                    infoFooterView.a = charSequence;
                    com.google.android.setupdesign.view.RichTextView richTextView = infoFooterView.b;
                    if (richTextView != null) {
                        richTextView.setText(charSequence);
                        infoFooterView.b.setVisibility(0);
                    }
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((com.google.android.setupdesign.GlifLayout) obj11).findViewById(2131429511);
                    for (rii riiVar : rkeVar.c) {
                        java.lang.Object obj12 = this.b;
                        aooh.c(obj12);
                        aooh.f(riiVar, "<this>");
                        aooh.f(obj12, "context");
                        android.content.Context context3 = (android.content.Context) obj12;
                        com.google.android.setupdesign.view.BulletPointView bulletPointView = new com.google.android.setupdesign.view.BulletPointView(context3);
                        android.graphics.drawable.Drawable drawable = context3.getDrawable(riiVar.a.intValue());
                        bulletPointView.a = drawable;
                        android.widget.ImageView imageView = bulletPointView.f;
                        if (imageView != null) {
                            imageView.setImageDrawable(drawable);
                            bulletPointView.f.setVisibility(0);
                            bulletPointView.g.setVisibility(0);
                        }
                        java.lang.CharSequence charSequence2 = riiVar.c;
                        bulletPointView.c = charSequence2;
                        com.google.android.setupdesign.view.RichTextView richTextView2 = bulletPointView.e;
                        if (richTextView2 != null) {
                            richTextView2.setText(charSequence2);
                            bulletPointView.e.setVisibility(0);
                        }
                        java.lang.CharSequence charSequence3 = riiVar.b;
                        bulletPointView.b = charSequence3;
                        com.google.android.setupdesign.view.RichTextView richTextView3 = bulletPointView.d;
                        if (richTextView3 != null) {
                            richTextView3.setText(charSequence3);
                            bulletPointView.d.setVisibility(0);
                        }
                        linearLayout.addView(bulletPointView);
                    }
                }
                return aojh.a;
        }
    }

    public /* synthetic */ aju(defpackage.asi asiVar, aoos aoosVar, apnt apntVar, aonj aonjVar, int i) {
        this.$cid = i;
        this.b = asiVar;
        this.d = aoosVar;
        this.a = apntVar;
        this.c = aonjVar;
    }

    public /* synthetic */ aju(defpackage.asi asiVar, aoot aootVar, aoos aoosVar, aoop aoopVar, int i) {
        this.$cid = i;
        this.b = asiVar;
        this.d = aootVar;
        this.c = aoosVar;
        this.a = aoopVar;
    }

    public /* synthetic */ aju(ccp ccpVar, defpackage.ajw ajwVar, aooq aooqVar, aoss aossVar, int i) {
        this.$cid = i;
        this.a = ccpVar;
        this.b = ajwVar;
        this.c = aooqVar;
        this.d = aossVar;
    }

    public /* synthetic */ aju(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ aju(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i, byte[] bArr) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.d = obj3;
        this.b = obj4;
    }

    public /* synthetic */ aju(rkc rkcVar, com.google.android.setupdesign.GlifLayout glifLayout, android.view.View view, android.content.Context context, int i) {
        this.$cid = i;
        this.c = rkcVar;
        this.d = glifLayout;
        this.a = view;
        this.b = context;
    }
}
