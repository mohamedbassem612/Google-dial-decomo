package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class avg implements aoxi {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public avg(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, xjz] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, xhi, xjz] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v24, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v26, types: [dbd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v35, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v38, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v41, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v44, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v48, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v10, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v16, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v43, types: [gvp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object, java.util.List] */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, aoln aolnVar) {
        boolean z = false;
        switch (this.$cid) {
            case 0:
                defpackage.ave aveVar = (avj) obj;
                if (aveVar instanceof avd) {
                    this.a.add(aveVar);
                } else if (aveVar instanceof defpackage.ave) {
                    this.a.remove(aveVar.a);
                }
                this.b.b(java.lang.Boolean.valueOf(!this.a.isEmpty()));
                return aojh.a;
            case 1:
                avj avjVar = (avj) obj;
                if (avjVar instanceof avb) {
                    this.a.add(avjVar);
                } else if (avjVar instanceof defpackage.avc) {
                    this.a.remove(((defpackage.avc) avjVar).a);
                } else if (avjVar instanceof defpackage.ava) {
                    this.a.remove(((defpackage.ava) avjVar).a);
                }
                this.b.b(java.lang.Boolean.valueOf(!this.a.isEmpty()));
                return aojh.a;
            case 2:
                avj avjVar2 = (avj) obj;
                if (avjVar2 instanceof avl) {
                    this.a.add(avjVar2);
                } else if (avjVar2 instanceof defpackage.avm) {
                    this.a.remove(((defpackage.avm) avjVar2).a);
                } else if (avjVar2 instanceof defpackage.avk) {
                    this.a.remove(((defpackage.avk) avjVar2).a);
                }
                this.b.b(java.lang.Boolean.valueOf(!this.a.isEmpty()));
                return aojh.a;
            case 3:
                avj avjVar3 = (avj) obj;
                if ((avjVar3 instanceof avh) || (avjVar3 instanceof avd) || (avjVar3 instanceof avl)) {
                    ((adq) this.b).q(avjVar3);
                } else if (avjVar3 instanceof defpackage.avi) {
                    ((adq) this.b).p(((defpackage.avi) avjVar3).a);
                } else if (avjVar3 instanceof defpackage.ave) {
                    ((adq) this.b).p(((defpackage.ave) avjVar3).a);
                } else if (avjVar3 instanceof defpackage.avm) {
                    ((adq) this.b).p(((defpackage.avm) avjVar3).a);
                } else if (avjVar3 instanceof defpackage.avk) {
                    ((adq) this.b).p(((defpackage.avk) avjVar3).a);
                }
                adq adqVar = (adq) this.b;
                java.lang.Object[] objArr = adqVar.a;
                int i = adqVar.b;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    avj avjVar4 = (avj) objArr[i3];
                    if (avjVar4 instanceof avh) {
                        i2 |= 2;
                    } else if (avjVar4 instanceof avd) {
                        i2 |= 1;
                    } else if (avjVar4 instanceof avl) {
                        i2 |= 4;
                    }
                }
                ((cei) ((vx) this.a).b).h(i2);
                return aojh.a;
            case 4:
                long j = ((cpm) obj).a;
                aii aiiVar = (aii) this.b;
                if ((((cpm) aiiVar.d()).a & 9223372034707292159L) != 9205357640488583168L && (9223372034707292159L & j) != 9205357640488583168L) {
                    if (java.lang.Float.intBitsToFloat((int) (((cpm) aiiVar.d()).a & 4294967295L)) != java.lang.Float.intBitsToFloat((int) (4294967295L & j))) {
                        aoov.an((aoss) this.a, (aolr) null, 0, new defpackage.atg(aiiVar, j, (aoln) null, 3), 3);
                        return aojh.a;
                    }
                }
                java.lang.Object objF = aiiVar.f(new cpm(j), aolnVar);
                return objF != aolu.a ? aojh.a : objF;
            case 5:
                avj avjVar5 = (avj) obj;
                if (avjVar5 instanceof avl) {
                    ((aoor) this.a).a++;
                } else if ((avjVar5 instanceof defpackage.avm) || (avjVar5 instanceof defpackage.avk)) {
                    ((aoor) this.a).a--;
                }
                boolean z2 = ((aoor) this.a).a > 0;
                ?? r12 = this.b;
                defpackage.bvx bvxVar = (defpackage.bvx) r12;
                if (bvxVar.c != z2) {
                    bvxVar.c = z2;
                    cfo.u((dbd) r12);
                }
                return aojh.a;
            case 6:
                this.b.e((gxl) this.a, (defpackage.hgt) obj);
                return aojh.a;
            case 7:
                defpackage.gqd gqdVar = (defpackage.gqd) obj;
                android.view.Display defaultDisplay = ((az) this.b).getWindowManager().getDefaultDisplay();
                aooh.c(defaultDisplay);
                aooh.f(gqdVar, "layoutInfo");
                aooh.f(defaultDisplay, "currentDisplay");
                aimz aimzVar = pzn.a;
                aimzVar.b().l("com/android/dialer/incall/earpieceondisplay/EarpieceOnDisplayTracker$Companion", "computeIfHasEarpiece", 90, "EarpieceOnDisplayTracker.kt").y("current display: %s", defaultDisplay);
                aooh.f(defaultDisplay, "display");
                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
                if (displayMetrics.widthPixels / displayMetrics.density >= 600.0f) {
                    aimw aimwVarL = aimzVar.b().l("com/android/dialer/incall/earpieceondisplay/EarpieceOnDisplayTracker$Companion", "computeIfHasEarpiece", 100, "EarpieceOnDisplayTracker.kt");
                    java.util.List list = gqdVar.a;
                    aimwVarL.w("layoutInfo with %s DisplayFeatures", list.size());
                    if (j$.util.Collection.-EL.stream(list).anyMatch(new defpackage.jty(new pmu(16), 16))) {
                        aimzVar.b().l("com/android/dialer/incall/earpieceondisplay/EarpieceOnDisplayTracker$Companion", "computeIfHasEarpiece", 103, "EarpieceOnDisplayTracker.kt").v("Has the feature. Earpiece is probably not on this display.");
                    } else {
                        aimzVar.b().l("com/android/dialer/incall/earpieceondisplay/EarpieceOnDisplayTracker$Companion", "computeIfHasEarpiece", 106, "EarpieceOnDisplayTracker.kt").v("Earpiece is probably on this display.");
                    }
                    pzn pznVar = (pzn) this.a;
                    pznVar.b.set(java.lang.Boolean.valueOf(z));
                    pznVar.c.a(ajcm.a);
                    return aojh.a;
                }
                aimzVar.b().l("com/android/dialer/incall/earpieceondisplay/EarpieceOnDisplayTracker$Companion", "computeIfHasEarpiece", 94, "EarpieceOnDisplayTracker.kt").y("Screen is smaller than %sdp. Earpiece is probably on this display", java.lang.Float.valueOf(600.0f));
                z = true;
                pzn pznVar2 = (pzn) this.a;
                pznVar2.b.set(java.lang.Boolean.valueOf(z));
                pznVar2.c.a(ajcm.a);
                return aojh.a;
            case 8:
                xhn xhnVar = (xhn) obj;
                xox.b("OnboardingTaskServiceServer", "Emitting metadata change for node " + xfh.a((xjz) this.b) + ": " + xhnVar);
                java.lang.Object objA = this.a.a(xhnVar, aolnVar);
                return objA != aolu.a ? aojh.a : objA;
            case 9:
                ?? r0 = this.b;
                xmq xmqVar = (xmq) obj;
                xox.b("OnboardingTaskServiceServer", "Emitting state change for node " + xfh.a((xjz) r0) + ": " + xmqVar);
                java.lang.Object objA2 = this.a.a(xmqVar.e((xhi) r0), aolnVar);
                return objA2 != aolu.a ? aojh.a : objA2;
            case 10:
                ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object objA3 = this.a.a(new java.lang.Integer(((defpackage.bcl) this.b).b() + 200), aolnVar);
                return objA3 != aolu.a ? aojh.a : objA3;
            case 11:
                ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object objA4 = this.a.a(new java.lang.Integer(((defpackage.bcl) this.b).b() + 200), aolnVar);
                return objA4 != aolu.a ? aojh.a : objA4;
            default:
                if (((java.lang.Number) obj).intValue() > 0) {
                    aoop aoopVar = (aoop) this.b;
                    if (!aoopVar.a) {
                        aoopVar.a = true;
                        java.lang.Object objA5 = this.a.a(aoyz.a, aolnVar);
                        if (objA5 == aolu.a) {
                            return objA5;
                        }
                    }
                }
                return aojh.a;
        }
    }

    public avg(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
