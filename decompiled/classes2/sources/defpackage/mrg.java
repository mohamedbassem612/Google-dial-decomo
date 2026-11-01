package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mrg {
    private java.lang.String b;
    private defpackage.msg c;
    private alxy d;
    private nok e;
    private defpackage.mta f;
    private java.lang.Boolean i;
    private defpackage.mok j;
    private final apdp k = new apdp();
    private final java.util.List a = new java.util.ArrayList();
    private final java.util.List g = new java.util.ArrayList();
    private final java.util.List h = new java.util.ArrayList();

    private static final defpackage.aixz m(defpackage.mok mokVar) {
        int i;
        akzx akzxVarM = defpackage.aixz.a.m();
        aooh.f(akzxVarM, "builder");
        int i2 = mokVar.b - 1;
        if (i2 != 1) {
            i = i2 != 2 ? 5 : 4;
        } else {
            i = 3;
        }
        akzxVarM.u();
        defpackage.aixz aixzVar = (defpackage.aixz) akzxVarM.b;
        aixzVar.c = a.Q(i);
        aixzVar.b |= 1;
        java.lang.Long l = mokVar.a;
        if (l != null) {
            long jLongValue = l.longValue();
            akzxVarM.u();
            defpackage.aixz aixzVar2 = (defpackage.aixz) akzxVarM.b;
            aixzVar2.b |= 2;
            aixzVar2.d = jLongValue;
        }
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.aixz) aladVarP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.mqu mquVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mqu) {
            mquVar = (defpackage.mqu) aolnVar;
            int i = mquVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mquVar.c = i - Integer.MIN_VALUE;
            } else {
                mquVar = new defpackage.mqu(this, aolnVar);
            }
        } else {
            mquVar = new defpackage.mqu(this, aolnVar);
        }
        java.lang.Object obj = mquVar.a;
        defpackage.aiye aiyeVarV = aolu.a;
        int i2 = mquVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.k;
                mquVar.d = apdpVar2;
                mquVar.c = 1;
                if (apdpVar2.b(mquVar) != aiyeVarV) {
                    apdpVar = apdpVar2;
                }
                return aiyeVarV;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = mquVar.d;
            aooc.af(obj);
            ajyi ajyiVarV = defpackage.ajee.v(defpackage.aiye.b.m());
            java.lang.Object obj2 = ajyiVarV.a;
            new alct(new alam(((defpackage.aiye) ((akzx) obj2).b).d, defpackage.aiye.a));
            java.util.List list = this.a;
            ((akzx) obj2).u();
            defpackage.aiye aiyeVar = (defpackage.aiye) ((akzx) obj2).b;
            alak alakVar = aiyeVar.d;
            if (!alakVar.c()) {
                aiyeVar.d = alad.H(alakVar);
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                aiyeVar.d.g(((defpackage.nvp) it.next()).bg);
            }
            java.lang.String str = this.b;
            if (str != null) {
                ((akzx) obj2).u();
                defpackage.aiye aiyeVar2 = (defpackage.aiye) ((akzx) obj2).b;
                j$.util.Objects.requireNonNull(str);
                aiyeVar2.c |= 1;
                aiyeVar2.e = str;
            }
            defpackage.msg msgVar = this.c;
            if (msgVar != null) {
                ajyi ajyiVarU = defpackage.ajee.u(aiyd.a.m());
                ajyiVarU.s(mni.y(msgVar.a));
                ajyiVarU.t(mni.z(msgVar.c));
                ajyiVarU.u(mni.A(msgVar.b));
                ajyiVarV.y(ajyiVarU.r());
            }
            alxy alxyVar = this.d;
            if (alxyVar != null) {
                akzx akzxVarM = defpackage.aiyc.a.m();
                aooh.f(akzxVarM, "builder");
                alxx alxxVarB = alxx.b(alxyVar.c);
                if (alxxVarB == null) {
                    alxxVarB = alxx.a;
                }
                int iX = mni.x(alxxVarB);
                akzxVarM.u();
                defpackage.aiyc aiycVar = (defpackage.aiyc) akzxVarM.b;
                aiycVar.c = iX - 1;
                aiycVar.b |= 1;
                alxx alxxVarB2 = alxx.b(alxyVar.e);
                if (alxxVarB2 == null) {
                    alxxVarB2 = alxx.a;
                }
                int iX2 = mni.x(alxxVarB2);
                akzxVarM.u();
                defpackage.aiyc aiycVar2 = (defpackage.aiyc) akzxVarM.b;
                aiycVar2.e = iX2 - 1;
                aiycVar2.b |= 4;
                int iAN = a.aN(alxyVar.d);
                if (iAN == 0) {
                    iAN = 1;
                }
                int iW = mni.w(iAN);
                akzxVarM.u();
                defpackage.aiyc aiycVar3 = (defpackage.aiyc) akzxVarM.b;
                aiycVar3.d = iW - 1;
                aiycVar3.b |= 2;
                alad aladVarP = akzxVarM.p();
                aooh.e(aladVarP, "build(...)");
                defpackage.aiyc aiycVar4 = (defpackage.aiyc) aladVarP;
                aooh.f(aiycVar4, "value");
                ((akzx) obj2).u();
                defpackage.aiye aiyeVar3 = (defpackage.aiye) ((akzx) obj2).b;
                j$.util.Objects.requireNonNull(aiycVar4);
                aiyeVar3.g = aiycVar4;
                aiyeVar3.c |= 4;
            }
            nok nokVar = this.e;
            if (nokVar != null) {
                defpackage.noi noiVarB = defpackage.noi.b(nokVar.d);
                if (noiVarB == null) {
                    noiVarB = defpackage.noi.UNRECOGNIZED;
                }
                ajyiVarV.w(mni.p(noiVarB));
                defpackage.noh nohVarB = defpackage.noh.b(nokVar.c);
                if (nohVarB == null) {
                    nohVarB = defpackage.noh.UNRECOGNIZED;
                }
                ajyiVarV.z(mni.u(nohVarB));
            }
            defpackage.mta mtaVar = this.f;
            if (mtaVar != null) {
                akzx akzxVarM2 = defpackage.aiya.a.m();
                aooh.f(akzxVarM2, "builder");
                int iR = mni.r(mtaVar.a);
                akzxVarM2.u();
                defpackage.aiya aiyaVar = (defpackage.aiya) akzxVarM2.b;
                aiyaVar.c = iR - 1;
                aiyaVar.b |= 1;
                int iS = mni.s(mtaVar.b);
                akzxVarM2.u();
                defpackage.aiya aiyaVar2 = (defpackage.aiya) akzxVarM2.b;
                aiyaVar2.d = iS - 1;
                aiyaVar2.b |= 2;
                alad aladVarP2 = akzxVarM2.p();
                aooh.e(aladVarP2, "build(...)");
                defpackage.aiya aiyaVar3 = (defpackage.aiya) aladVarP2;
                aooh.f(aiyaVar3, "value");
                ((akzx) obj2).u();
                defpackage.aiye aiyeVar4 = (defpackage.aiye) ((akzx) obj2).b;
                j$.util.Objects.requireNonNull(aiyaVar3);
                aiyeVar4.j = aiyaVar3;
                aiyeVar4.c |= 32;
            }
            java.util.List list2 = this.g;
            if (!list2.isEmpty()) {
                java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.aiye) ((akzx) obj2).b).k);
                aooh.e(listUnmodifiableList, "getLanguageDetectionEventsList(...)");
                new alct(listUnmodifiableList);
                ((akzx) obj2).u();
                defpackage.aiye aiyeVar5 = (defpackage.aiye) ((akzx) obj2).b;
                alat alatVar = aiyeVar5.k;
                if (!alatVar.c()) {
                    aiyeVar5.k = alad.J(alatVar);
                }
                akyl.i(list2, aiyeVar5.k);
            }
            java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(((defpackage.aiye) ((akzx) obj2).b).l);
            aooh.e(listUnmodifiableList2, "getDuplexModelIntentsPredictionsList(...)");
            new alct(listUnmodifiableList2);
            java.util.List list3 = this.h;
            ((akzx) obj2).u();
            defpackage.aiye aiyeVar6 = (defpackage.aiye) ((akzx) obj2).b;
            alat alatVar2 = aiyeVar6.l;
            if (!alatVar2.c()) {
                aiyeVar6.l = alad.J(alatVar2);
            }
            akyl.i(list3, aiyeVar6.l);
            java.lang.Boolean bool = this.i;
            if (bool != null) {
                ajyiVarV.x(bool.booleanValue());
            }
            defpackage.mok mokVar = this.j;
            if (mokVar != null) {
                defpackage.aixz aixzVarM = m(mokVar);
                aooh.f(aixzVarM, "value");
                ((akzx) obj2).u();
                defpackage.aiye aiyeVar7 = (defpackage.aiye) ((akzx) obj2).b;
                j$.util.Objects.requireNonNull(aixzVarM);
                aiyeVar7.n = aixzVarM;
                aiyeVar7.c |= 128;
            }
            aiyeVarV = ajyiVarV.v();
            return aiyeVarV;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.mqv mqvVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mqv) {
            mqvVar = (defpackage.mqv) aolnVar;
            int i = mqvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqvVar.c = i - Integer.MIN_VALUE;
            } else {
                mqvVar = new defpackage.mqv(this, aolnVar);
            }
        } else {
            mqvVar = new defpackage.mqv(this, aolnVar);
        }
        java.lang.Object obj = mqvVar.a;
        defpackage.aivr aivrVarAH = aolu.a;
        int i2 = mqvVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.k;
                mqvVar.d = apdpVar2;
                mqvVar.c = 1;
                if (apdpVar2.b(mqvVar) != aivrVarAH) {
                    apdpVar = apdpVar2;
                }
                return aivrVarAH;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = mqvVar.d;
            aooc.af(obj);
            uzx uzxVarB = defpackage.airh.B(defpackage.aivr.b.m());
            defpackage.msg msgVar = this.c;
            if (msgVar != null) {
                int iY = mni.y(msgVar.a);
                java.lang.Object obj2 = uzxVarB.a;
                ((akzx) obj2).u();
                defpackage.aivr aivrVar = (defpackage.aivr) ((akzx) obj2).b;
                aivrVar.d = iY - 1;
                aivrVar.c |= 1;
                int iZ = mni.z(msgVar.c);
                ((akzx) obj2).u();
                defpackage.aivr aivrVar2 = (defpackage.aivr) ((akzx) obj2).b;
                aivrVar2.e = iZ - 1;
                aivrVar2.c |= 2;
                int iA = mni.A(msgVar.b);
                ((akzx) obj2).u();
                defpackage.aivr aivrVar3 = (defpackage.aivr) ((akzx) obj2).b;
                aivrVar3.m = iA - 1;
                aivrVar3.c |= 256;
            }
            java.lang.String str = this.b;
            if (str != null) {
                java.lang.Object obj3 = uzxVarB.a;
                ((akzx) obj3).u();
                defpackage.aivr aivrVar4 = (defpackage.aivr) ((akzx) obj3).b;
                j$.util.Objects.requireNonNull(str);
                aivrVar4.c |= 4;
                aivrVar4.f = str;
            }
            alxy alxyVar = this.d;
            if (alxyVar != null) {
                alxx alxxVarB = alxx.b(alxyVar.c);
                if (alxxVarB == null) {
                    alxxVarB = alxx.a;
                }
                int iX = mni.x(alxxVarB);
                java.lang.Object obj4 = uzxVarB.a;
                ((akzx) obj4).u();
                defpackage.aivr aivrVar5 = (defpackage.aivr) ((akzx) obj4).b;
                aivrVar5.g = iX - 1;
                aivrVar5.c |= 8;
                alxx alxxVarB2 = alxx.b(alxyVar.e);
                if (alxxVarB2 == null) {
                    alxxVarB2 = alxx.a;
                }
                int iX2 = mni.x(alxxVarB2);
                ((akzx) obj4).u();
                defpackage.aivr aivrVar6 = (defpackage.aivr) ((akzx) obj4).b;
                aivrVar6.h = iX2 - 1;
                aivrVar6.c |= 16;
                int iAN = a.aN(alxyVar.d);
                int iW = mni.w(iAN != 0 ? iAN : 1);
                ((akzx) obj4).u();
                defpackage.aivr aivrVar7 = (defpackage.aivr) ((akzx) obj4).b;
                aivrVar7.i = iW - 1;
                aivrVar7.c |= 32;
            }
            nok nokVar = this.e;
            if (nokVar != null) {
                defpackage.noi noiVarB = defpackage.noi.b(nokVar.d);
                if (noiVarB == null) {
                    noiVarB = defpackage.noi.UNRECOGNIZED;
                }
                uzxVarB.aI(mni.p(noiVarB));
                defpackage.noh nohVarB = defpackage.noh.b(nokVar.c);
                if (nohVarB == null) {
                    nohVarB = defpackage.noh.UNRECOGNIZED;
                }
                uzxVarB.aK(mni.u(nohVarB));
            }
            java.lang.Object obj5 = uzxVarB.a;
            new alct(new alam(((defpackage.aivr) ((akzx) obj5).b).l, defpackage.aivr.a));
            java.util.List list = this.a;
            ((akzx) obj5).u();
            defpackage.aivr aivrVar8 = (defpackage.aivr) ((akzx) obj5).b;
            alak alakVar = aivrVar8.l;
            if (!alakVar.c()) {
                aivrVar8.l = alad.H(alakVar);
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                aivrVar8.l.g(((defpackage.nvp) it.next()).bg);
            }
            java.lang.Boolean bool = this.i;
            if (bool != null) {
                uzxVarB.aJ(bool.booleanValue());
            }
            defpackage.mok mokVar = this.j;
            if (mokVar != null) {
                defpackage.aixz aixzVarM = m(mokVar);
                aooh.f(aixzVarM, "value");
                ((akzx) obj5).u();
                defpackage.aivr aivrVar9 = (defpackage.aivr) ((akzx) obj5).b;
                j$.util.Objects.requireNonNull(aixzVarM);
                aivrVar9.o = aixzVarM;
                aivrVar9.c |= 1024;
            }
            aivrVarAH = uzxVarB.aH();
            return aivrVarAH;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(boolean z, aoln aolnVar) {
        defpackage.mqw mqwVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mqw) {
            mqwVar = (defpackage.mqw) aolnVar;
            int i = mqwVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqwVar.d = i - Integer.MIN_VALUE;
            } else {
                mqwVar = new defpackage.mqw(this, aolnVar);
            }
        } else {
            mqwVar = new defpackage.mqw(this, aolnVar);
        }
        java.lang.Object obj = mqwVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mqwVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.k;
                mqwVar.e = apdpVar2;
                mqwVar.a = z;
                mqwVar.d = 1;
                if (apdpVar2.b(mqwVar) != aojhVar) {
                    apdpVar = apdpVar2;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = mqwVar.a;
            apdpVar = mqwVar.e;
            aooc.af(obj);
            this.i = java.lang.Boolean.valueOf(z);
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.mok mokVar, aoln aolnVar) {
        defpackage.mqx mqxVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mqx) {
            mqxVar = (defpackage.mqx) aolnVar;
            int i = mqxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqxVar.c = i - Integer.MIN_VALUE;
            } else {
                mqxVar = new defpackage.mqx(this, aolnVar);
            }
        } else {
            mqxVar = new defpackage.mqx(this, aolnVar);
        }
        java.lang.Object obj = mqxVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mqxVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.k;
                mqxVar.d = mokVar;
                mqxVar.e = apdpVar;
                mqxVar.c = 1;
                if (apdpVar.b(mqxVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mqxVar.e;
            defpackage.mok mokVar2 = mqxVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            mokVar = mokVar2;
            this.j = mokVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.mta mtaVar, aoln aolnVar) {
        defpackage.mqy mqyVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mqy) {
            mqyVar = (defpackage.mqy) aolnVar;
            int i = mqyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqyVar.c = i - Integer.MIN_VALUE;
            } else {
                mqyVar = new defpackage.mqy(this, aolnVar);
            }
        } else {
            mqyVar = new defpackage.mqy(this, aolnVar);
        }
        java.lang.Object obj = mqyVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mqyVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.k;
                mqyVar.d = mtaVar;
                mqyVar.e = apdpVar;
                mqyVar.c = 1;
                if (apdpVar.b(mqyVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mqyVar.e;
            defpackage.mta mtaVar2 = mqyVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            mtaVar = mtaVar2;
            this.f = mtaVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.nvp nvpVar, aoln aolnVar) {
        defpackage.mqz mqzVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mqz) {
            mqzVar = (defpackage.mqz) aolnVar;
            int i = mqzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqzVar.c = i - Integer.MIN_VALUE;
            } else {
                mqzVar = new defpackage.mqz(this, aolnVar);
            }
        } else {
            mqzVar = new defpackage.mqz(this, aolnVar);
        }
        java.lang.Object obj = mqzVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mqzVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.k;
                mqzVar.d = nvpVar;
                mqzVar.e = apdpVar;
                mqzVar.c = 1;
                if (apdpVar.b(mqzVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mqzVar.e;
            defpackage.nvp nvpVar2 = mqzVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            nvpVar = nvpVar2;
            aooh.f(nvpVar, "<this>");
            switch (nvpVar.ordinal()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_LEFT /* 23 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                case 30:
                case 32:
                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_STRAIGHT /* 36 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                case 48:
                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                case 52:
                case 53:
                case 56:
                case 66:
                case 70:
                case 71:
                case 72:
                case 85:
                case 86:
                case 91:
                case 92:
                case 95:
                case 97:
                case androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                case 105:
                case 106:
                    this.a.add(nvpVar);
                case 0:
                case 11:
                case 12:
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                case 16:
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_LEFT /* 21 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_RIGHT /* 22 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_LEFT /* 25 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_RIGHT /* 26 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_LEFT /* 27 */:
                case 31:
                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                case 51:
                case 54:
                case 55:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                case 65:
                case 67:
                case 68:
                case 69:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                case 81:
                case 82:
                case 83:
                case 84:
                case 87:
                case 88:
                case 89:
                case 90:
                case 93:
                case 94:
                case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                case 98:
                case 99:
                case 100:
                case 102:
                case 103:
                case 104:
                case 107:
                case 108:
                case 109:
                    aojhVar = aojh.a;
                    apdpVar.d();
                    return aojhVar;
                default:
                    throw new aois();
            }
        } catch (java.lang.Throwable th) {
            apdpVar.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(nok nokVar, aoln aolnVar) {
        defpackage.mra mraVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mra) {
            mraVar = (defpackage.mra) aolnVar;
            int i = mraVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mraVar.c = i - Integer.MIN_VALUE;
            } else {
                mraVar = new defpackage.mra(this, aolnVar);
            }
        } else {
            mraVar = new defpackage.mra(this, aolnVar);
        }
        java.lang.Object obj = mraVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mraVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.k;
                mraVar.d = nokVar;
                mraVar.e = apdpVar;
                mraVar.c = 1;
                if (apdpVar.b(mraVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mraVar.e;
            nok nokVar2 = mraVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            nokVar = nokVar2;
            this.e = nokVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(defpackage.msg msgVar, aoln aolnVar) {
        defpackage.mrb mrbVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mrb) {
            mrbVar = (defpackage.mrb) aolnVar;
            int i = mrbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrbVar.c = i - Integer.MIN_VALUE;
            } else {
                mrbVar = new defpackage.mrb(this, aolnVar);
            }
        } else {
            mrbVar = new defpackage.mrb(this, aolnVar);
        }
        java.lang.Object obj = mrbVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mrbVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.k;
                mrbVar.d = msgVar;
                mrbVar.e = apdpVar;
                mrbVar.c = 1;
                if (apdpVar.b(mrbVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mrbVar.e;
            defpackage.msg msgVar2 = mrbVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            msgVar = msgVar2;
            this.c = msgVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(alsg alsgVar, aoln aolnVar) {
        defpackage.mrc mrcVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mrc) {
            mrcVar = (defpackage.mrc) aolnVar;
            int i = mrcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrcVar.c = i - Integer.MIN_VALUE;
            } else {
                mrcVar = new defpackage.mrc(this, aolnVar);
            }
        } else {
            mrcVar = new defpackage.mrc(this, aolnVar);
        }
        java.lang.Object obj = mrcVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mrcVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            apdpVar = this.k;
            mrcVar.d = alsgVar;
            mrcVar.e = apdpVar;
            mrcVar.c = 1;
            if (apdpVar.b(mrcVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mrcVar.e;
            alsg alsgVar2 = mrcVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            alsgVar = alsgVar2;
        }
        try {
            this.h.add(alsgVar);
            return aojh.a;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(java.lang.String str, aoln aolnVar) {
        defpackage.mrd mrdVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mrd) {
            mrdVar = (defpackage.mrd) aolnVar;
            int i = mrdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrdVar.c = i - Integer.MIN_VALUE;
            } else {
                mrdVar = new defpackage.mrd(this, aolnVar);
            }
        } else {
            mrdVar = new defpackage.mrd(this, aolnVar);
        }
        java.lang.Object obj = mrdVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mrdVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.k;
                mrdVar.d = str;
                mrdVar.e = apdpVar;
                mrdVar.c = 1;
                if (apdpVar.b(mrdVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mrdVar.e;
            java.lang.String str2 = mrdVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            str = str2;
            this.b = str;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(alxy alxyVar, aoln aolnVar) {
        defpackage.mre mreVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mre) {
            mreVar = (defpackage.mre) aolnVar;
            int i = mreVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mreVar.c = i - Integer.MIN_VALUE;
            } else {
                mreVar = new defpackage.mre(this, aolnVar);
            }
        } else {
            mreVar = new defpackage.mre(this, aolnVar);
        }
        java.lang.Object obj = mreVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mreVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.k;
                mreVar.d = alxyVar;
                mreVar.e = apdpVar;
                mreVar.c = 1;
                if (apdpVar.b(mreVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mreVar.e;
            alxy alxyVar2 = mreVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            alxyVar = alxyVar2;
            this.d = alxyVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object l(tvx tvxVar, aoln aolnVar) {
        defpackage.mrf mrfVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mrf) {
            mrfVar = (defpackage.mrf) aolnVar;
            int i = mrfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrfVar.c = i - Integer.MIN_VALUE;
            } else {
                mrfVar = new defpackage.mrf(this, aolnVar);
            }
        } else {
            mrfVar = new defpackage.mrf(this, aolnVar);
        }
        java.lang.Object obj = mrfVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mrfVar.c;
        int i3 = 1;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.k;
                mrfVar.d = tvxVar;
                mrfVar.e = apdpVar;
                mrfVar.c = 1;
                if (apdpVar.b(mrfVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mrfVar.e;
            tvx tvxVar2 = mrfVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            tvxVar = tvxVar2;
            java.util.List list = this.g;
            akzx akzxVarM = defpackage.aiyb.a.m();
            aooh.f(akzxVarM, "builder");
            java.lang.String str = tvxVar.c;
            aooh.e(str, "getLanguageClassification(...)");
            aooh.f(str, "value");
            akzxVarM.u();
            defpackage.aiyb aiybVar = (defpackage.aiyb) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            aiybVar.b |= 1;
            aiybVar.c = str;
            int iAN = a.aN(tvxVar.d);
            if (iAN == 0) {
                iAN = 1;
            }
            int i4 = iAN - 1;
            if (i4 == 1) {
                i3 = 2;
            } else if (i4 == 2) {
                i3 = 3;
            } else if (i4 == 3) {
                i3 = 4;
            }
            akzxVarM.u();
            defpackage.aiyb aiybVar2 = (defpackage.aiyb) akzxVarM.b;
            aiybVar2.d = i3 - 1;
            aiybVar2.b |= 2;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            list.add((defpackage.aiyb) aladVarP);
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }
}
