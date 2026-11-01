package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wgf implements android.view.View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public wgf(android.content.Context context, android.content.Intent intent, int i) {
        this.$cid = i;
        this.a = context;
        this.b = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v45, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v26, types: [aelt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v28, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v30, types: [android.content.Context, com.google.android.libraries.social.licenses.LicenseMenuActivity] */
    /* JADX WARN: Type inference failed for: r1v14, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r1v8, types: [aelf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [aeit, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [aelt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ?? r8;
        int i = 0;
        int i2 = 1;
        switch (this.$cid) {
            case 0:
                j$.util.Optional optional = (j$.util.Optional) this.b;
                optional.isPresent();
                ((defpackage.uxp) optional.get()).a();
                ((defpackage.wgh) this.a).dismiss();
                return;
            case 1:
                java.lang.Object obj = this.a;
                j$.util.Optional optional2 = ((wdx) this.b).l;
                defpackage.vxc vxcVar = new defpackage.vxc(obj, 14);
                if (true == optional2.isPresent()) {
                    ((pff) optional2.get()).c(((defpackage.wdh) vxcVar.a).e);
                    return;
                }
                return;
            case 2:
                new defpackage.afpl((android.app.Activity) ((defpackage.wqh) this.b).g.G()).N((android.content.Intent) this.a);
                return;
            case 3:
                try {
                    ((android.content.Context) this.a).startActivity((android.content.Intent) this.b);
                    return;
                } catch (android.content.ActivityNotFoundException e) {
                    android.util.Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
                    return;
                }
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Object obj2 = this.a;
                ahpm ahpmVarA = ((defpackage.ackk) obj2).b.a("TooltipFragment");
                java.lang.Object obj3 = this.b;
                try {
                    ((defpackage.ackk) obj2).e = false;
                    defpackage.afpl afplVar = ((defpackage.ackk) obj2).ap;
                    com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext = ((defpackage.ackk) obj2).al;
                    acit acitVar = ((defpackage.ackk) obj2).a;
                    akjc akjcVar = ((defpackage.akkh) obj3).k;
                    if (akjcVar == null) {
                        akjcVar = akjc.a;
                    }
                    afplVar.v(promoContext, acitVar.c(akjcVar));
                    ahpmVarA.close();
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        ahpmVarA.close();
                        break;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.alln allnVar = (defpackage.alln) this.a;
                ?? r1 = allnVar.a;
                ?? r2 = allnVar.f;
                r1.a(r2.a(), (defpackage.alfm) allnVar.d);
                allnVar.b.e(new adae(5), view);
                java.lang.Object obj4 = this.b;
                defpackage.aejx aejxVar = (defpackage.aejx) ((defpackage.aeja) allnVar.e).a;
                aejxVar.b.a.g(obj4);
                defpackage.aekj aekjVar = aejxVar.a;
                aekjVar.post(new defpackage.absj(aekjVar, 17));
                r1.a(r2.a(), (defpackage.alfm) allnVar.c);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ((defpackage.aejh) this.b).v.e(new adae(5), view);
                ((defpackage.aejg) this.a).e.onClick(view);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.aekj aekjVar2 = (defpackage.aekj) this.a;
                if (aekjVar2.c) {
                    this.b.e(new adae(5), view);
                    aekjVar2.q(32);
                    aekjVar2.i(false);
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ?? r15 = ((defpackage.afbl) this.b).e;
                if (r15 != 0) {
                    ?? r14 = this.a;
                    ?? intent = new android.content.Intent((android.content.Context) r15, (java.lang.Class<?>) com.google.android.libraries.social.licenses.LicenseActivity.class);
                    intent.putExtra("license", r14);
                    r15.startActivity(intent);
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                apdh apdhVar = new apdh();
                defpackage.afky afkyVar = (defpackage.afky) this.a;
                afkyVar.j(afkyVar.d, afkyVar.k, afkyVar.h, afjz.l(afkyVar.f));
                afkyVar.b.dismissAllowingStateLoss();
                aehj.D(apdhVar, afkyVar.d, (java.lang.String) this.b);
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                ((defpackage.afky) this.a).g((defpackage.amiv) this.b);
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.afky afkyVar2 = (defpackage.afky) this.a;
                java.lang.String str = afkyVar2.l;
                akzx akzxVarM = amig.a.m();
                boolean zC = afkyVar2.g.c();
                java.lang.Object obj5 = this.b;
                if (zC) {
                    java.lang.String strCo = ahvr.co(str);
                    akzx akzxVarM2 = amic.a.m();
                    akzxVarM2.u();
                    amic amicVar = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(strCo);
                    amicVar.b = strCo;
                    amic amicVarP = akzxVarM2.p();
                    int i3 = ((defpackage.amiv) obj5).e;
                    akzxVarM.u();
                    akzxVarM.b.d = i3;
                    akzxVarM.u();
                    amig amigVar = akzxVarM.b;
                    j$.util.Objects.requireNonNull(amicVarP);
                    amigVar.c = amicVarP;
                    amigVar.b = 5;
                }
                amig amigVarP = akzxVarM.p();
                if (amigVarP != null) {
                    afkyVar2.c.a = amigVarP;
                }
                afkyVar2.b((defpackage.amiv) obj5);
                afkyVar2.c();
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                apdh apdhVar2 = new apdh();
                defpackage.afky afkyVar3 = (defpackage.afky) this.a;
                afkyVar3.j(afkyVar3.d, afkyVar3.k, afkyVar3.h, afjz.l(afkyVar3.f));
                afkyVar3.b.dismissAllowingStateLoss();
                aehj.D(apdhVar2, afkyVar3.d, (java.lang.String) this.b);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.afky afkyVar4 = (defpackage.afky) this.a;
                afjj afjjVarA = afkyVar4.a();
                if (afjjVarA != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    int i4 = 0;
                    while (true) {
                        boolean[] zArr = (boolean[]) afkyVar4.o.b;
                        if (i4 < zArr.length) {
                            if (zArr[i4]) {
                                arrayList.add(java.lang.Integer.valueOf(i4));
                            }
                            i4++;
                        } else {
                            defpackage.aprf aprfVar = aehj.b;
                            aify.n(arrayList);
                            defpackage.aprf.w(aprfVar, afjjVarA);
                        }
                    }
                }
                java.lang.Object obj6 = this.b;
                defpackage.afpl afplVar2 = afkyVar4.o;
                akzx akzxVarM3 = amig.a.m();
                if (afkyVar4.g.c()) {
                    akzx akzxVarM4 = amib.a.m();
                    defpackage.amiv amivVar = (defpackage.amiv) obj6;
                    amhn amhnVar = (amivVar.c == 5 ? (defpackage.amin) amivVar.d : defpackage.amin.a).c;
                    if (amhnVar == null) {
                        amhnVar = amhn.a;
                    }
                    alat alatVar = amhnVar.b;
                    while (true) {
                        boolean[] zArr2 = (boolean[]) afplVar2.b;
                        if (i < zArr2.length) {
                            if (zArr2[i]) {
                                java.lang.String str2 = ((defpackage.amhm) alatVar.get(i)).e;
                                int iW = a.W(((defpackage.amhm) alatVar.get(i)).c);
                                int i5 = 4;
                                if (iW != 0 && iW == 4) {
                                    ?? r10 = afplVar2.a;
                                    r8 = str2;
                                    if (!android.text.TextUtils.isEmpty(r10)) {
                                        r8 = r10;
                                    }
                                }
                                r8 = str2;
                                r8 = str2;
                                akzx akzxVarM5 = defpackage.amie.a.m();
                                int i6 = ((defpackage.amhm) alatVar.get(i)).d;
                                akzxVarM5.u();
                                ((defpackage.amie) akzxVarM5.b).c = i6;
                                akzxVarM5.u();
                                defpackage.amie amieVar = (defpackage.amie) akzxVarM5.b;
                                j$.util.Objects.requireNonNull((java.lang.Object) r8);
                                amieVar.d = (java.lang.String) r8;
                                int iW2 = a.W(((defpackage.amhm) alatVar.get(i)).c);
                                if (iW2 == 0) {
                                    iW2 = 1;
                                }
                                int i7 = iW2 - 2;
                                if (i7 == 1) {
                                    i5 = 3;
                                } else if (i7 != 2) {
                                    i5 = i7 != 3 ? 2 : 5;
                                }
                                akzxVarM5.u();
                                ((defpackage.amie) akzxVarM5.b).b = a.Q(i5);
                                akzxVarM4.bg((defpackage.amie) akzxVarM5.p());
                                afkyVar4.g.a();
                            }
                            int i8 = amivVar.e;
                            akzxVarM3.u();
                            akzxVarM3.b.d = i8;
                            amib amibVarP = akzxVarM4.p();
                            akzxVarM3.u();
                            amig amigVar2 = akzxVarM3.b;
                            j$.util.Objects.requireNonNull(amibVarP);
                            amigVar2.c = amibVarP;
                            amigVar2.b = 3;
                            i++;
                        }
                    }
                }
                amig amigVarP2 = akzxVarM3.p();
                if (amigVarP2 != null) {
                    afkyVar4.c.a = amigVarP2;
                }
                afkyVar4.b((defpackage.amiv) obj6);
                afkyVar4.c();
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.aflh.c((android.view.ViewGroup) this.a);
                new android.os.Handler().postDelayed(new aetv(this.b, 20), 250L);
                return;
            case 15:
                defpackage.aflh.c((android.view.ViewGroup) this.a);
                new android.os.Handler().postDelayed(new defpackage.aflt(this.b, i2), 250L);
                return;
            case 16:
                apdh apdhVar3 = new apdh();
                defpackage.aflv aflvVar = (defpackage.aflv) this.a;
                aflvVar.o(6);
                afjz.h(aflvVar.i);
                android.app.Activity activity = aflvVar.u;
                activity.finish();
                aehj.D(apdhVar3, activity, (java.lang.String) this.b);
                return;
            case 17:
                apdh apdhVar4 = new apdh();
                defpackage.aflv aflvVar2 = (defpackage.aflv) this.a;
                aflvVar2.f();
                aehj.E(apdhVar4, aflvVar2.u, (java.lang.String) this.b);
                return;
            case 18:
                apdh apdhVar5 = new apdh();
                defpackage.afjf afjfVar = (defpackage.afjf) this.a;
                afjfVar.m(6);
                afjz.h(afjfVar.i);
                java.util.Iterator it = afjfVar.c().iterator();
                while (it.hasNext()) {
                    ((defpackage.afly) it.next()).r();
                }
                aehj.D(apdhVar5, afjfVar.a(), (java.lang.String) this.b);
                return;
            case 19:
                apdh apdhVar6 = new apdh();
                defpackage.afjf afjfVar2 = (defpackage.afjf) this.a;
                afjfVar2.g();
                aehj.E(apdhVar6, afjfVar2.a(), (java.lang.String) this.b);
                return;
            default:
                this.a.onClick(view);
                ((defpackage.agbv) this.b).e(1);
                return;
        }
    }

    public /* synthetic */ wgf(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ wgf(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
