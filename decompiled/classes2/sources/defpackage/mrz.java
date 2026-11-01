package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mrz {
    private defpackage.msg c;
    private alxy d;
    private java.lang.String e;
    private defpackage.iht f;
    private nok g;
    private defpackage.mzv h;
    private defpackage.nfb i;
    private defpackage.igw k;
    private java.lang.String m;
    private defpackage.mta o;
    private java.lang.Boolean p;
    private final apdp q = new apdp();
    private final java.util.List a = new java.util.ArrayList();
    private final java.util.List b = new java.util.ArrayList();
    private final java.util.List j = new java.util.ArrayList();
    private final java.util.List l = new java.util.ArrayList();
    private final java.util.List n = new java.util.ArrayList();

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.mrh mrhVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mrh) {
            mrhVar = (defpackage.mrh) aolnVar;
            int i = mrhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrhVar.c = i - Integer.MIN_VALUE;
            } else {
                mrhVar = new defpackage.mrh(this, aolnVar);
            }
        } else {
            mrhVar = new defpackage.mrh(this, aolnVar);
        }
        java.lang.Object obj = mrhVar.a;
        defpackage.mse mseVar = aolu.a;
        int i2 = mrhVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.q;
                mrhVar.d = apdpVar2;
                mrhVar.c = 1;
                if (apdpVar2.b(mrhVar) != mseVar) {
                    apdpVar = apdpVar2;
                }
                return mseVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = mrhVar.d;
            aooc.af(obj);
            akzx akzxVarM = defpackage.mse.a.m();
            aooh.f(akzxVarM, "builder");
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.mse) akzxVarM.b).c);
            aooh.e(listUnmodifiableList, "getDobbyEventList(...)");
            new alct(listUnmodifiableList);
            java.util.List list = this.a;
            akzxVarM.u();
            defpackage.mse mseVar2 = (defpackage.mse) akzxVarM.b;
            alat alatVar = mseVar2.c;
            if (!alatVar.c()) {
                mseVar2.c = alad.J(alatVar);
            }
            akyl.i(list, mseVar2.c);
            java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(((defpackage.mse) akzxVarM.b).d);
            aooh.e(listUnmodifiableList2, "getDobbyDuplexEventLogList(...)");
            new alct(listUnmodifiableList2);
            java.util.List list2 = this.b;
            akzxVarM.u();
            defpackage.mse mseVar3 = (defpackage.mse) akzxVarM.b;
            alat alatVar2 = mseVar3.d;
            if (!alatVar2.c()) {
                mseVar3.d = alad.J(alatVar2);
            }
            akyl.i(list2, mseVar3.d);
            defpackage.msg msgVar = this.c;
            if (msgVar != null) {
                akzx akzxVarM2 = defpackage.msd.a.m();
                aooh.f(akzxVarM2, "builder");
                int iY = mni.y(msgVar.a);
                akzxVarM2.u();
                defpackage.msd msdVar = (defpackage.msd) akzxVarM2.b;
                msdVar.c = iY - 1;
                msdVar.b |= 1;
                int iZ = mni.z(msgVar.c);
                akzxVarM2.u();
                defpackage.msd msdVar2 = (defpackage.msd) akzxVarM2.b;
                msdVar2.d = iZ - 1;
                msdVar2.b |= 2;
                int iA = mni.A(msgVar.b);
                akzxVarM2.u();
                defpackage.msd msdVar3 = (defpackage.msd) akzxVarM2.b;
                msdVar3.e = iA - 1;
                msdVar3.b |= 4;
                alad aladVarP = akzxVarM2.p();
                aooh.e(aladVarP, "build(...)");
                defpackage.msd msdVar4 = (defpackage.msd) aladVarP;
                aooh.f(msdVar4, "value");
                akzxVarM.u();
                defpackage.mse mseVar4 = (defpackage.mse) akzxVarM.b;
                j$.util.Objects.requireNonNull(msdVar4);
                mseVar4.j = msdVar4;
                mseVar4.b |= 32;
            }
            alxy alxyVar = this.d;
            if (alxyVar != null) {
                akzx akzxVarM3 = defpackage.msc.a.m();
                aooh.f(akzxVarM3, "builder");
                alxx alxxVarB = alxx.b(alxyVar.c);
                if (alxxVarB == null) {
                    alxxVarB = alxx.a;
                }
                int iX = mni.x(alxxVarB);
                akzxVarM3.u();
                defpackage.msc mscVar = (defpackage.msc) akzxVarM3.b;
                mscVar.c = iX - 1;
                mscVar.b |= 1;
                alxx alxxVarB2 = alxx.b(alxyVar.e);
                if (alxxVarB2 == null) {
                    alxxVarB2 = alxx.a;
                }
                int iX2 = mni.x(alxxVarB2);
                akzxVarM3.u();
                defpackage.msc mscVar2 = (defpackage.msc) akzxVarM3.b;
                mscVar2.e = iX2 - 1;
                mscVar2.b |= 4;
                int iAN = a.aN(alxyVar.d);
                if (iAN == 0) {
                    iAN = 1;
                }
                int iW = mni.w(iAN);
                akzxVarM3.u();
                defpackage.msc mscVar3 = (defpackage.msc) akzxVarM3.b;
                mscVar3.d = iW - 1;
                mscVar3.b |= 2;
                alad aladVarP2 = akzxVarM3.p();
                aooh.e(aladVarP2, "build(...)");
                defpackage.msc mscVar4 = (defpackage.msc) aladVarP2;
                aooh.f(mscVar4, "value");
                akzxVarM.u();
                defpackage.mse mseVar5 = (defpackage.mse) akzxVarM.b;
                j$.util.Objects.requireNonNull(mscVar4);
                mseVar5.e = mscVar4;
                mseVar5.b |= 1;
            }
            java.lang.String str = this.e;
            if (str != null) {
                akzxVarM.u();
                defpackage.mse mseVar6 = (defpackage.mse) akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                mseVar6.b |= 2;
                mseVar6.f = str;
            }
            defpackage.iht ihtVar = this.f;
            if (ihtVar != null) {
                int iQ = mni.q(ihtVar);
                akzxVarM.u();
                defpackage.mse mseVar7 = (defpackage.mse) akzxVarM.b;
                mseVar7.g = mni.af(iQ);
                mseVar7.b |= 4;
            }
            nok nokVar = this.g;
            if (nokVar != null) {
                defpackage.noi noiVarB = defpackage.noi.b(nokVar.d);
                if (noiVarB == null) {
                    noiVarB = defpackage.noi.UNRECOGNIZED;
                }
                defpackage.nvq nvqVarP = mni.p(noiVarB);
                akzxVarM.u();
                defpackage.mse mseVar8 = (defpackage.mse) akzxVarM.b;
                mseVar8.h = nvqVarP.e;
                mseVar8.b |= 8;
                defpackage.noh nohVarB = defpackage.noh.b(nokVar.c);
                if (nohVarB == null) {
                    nohVarB = defpackage.noh.UNRECOGNIZED;
                }
                int iU = mni.u(nohVarB);
                akzxVarM.u();
                defpackage.mse mseVar9 = (defpackage.mse) akzxVarM.b;
                mseVar9.i = iU - 1;
                mseVar9.b |= 16;
                boolean z = nokVar.f;
                akzxVarM.u();
                defpackage.mse mseVar10 = (defpackage.mse) akzxVarM.b;
                mseVar10.b |= 64;
                mseVar10.k = z;
                boolean z2 = nokVar.g;
                akzxVarM.u();
                defpackage.mse mseVar11 = (defpackage.mse) akzxVarM.b;
                mseVar11.b |= 128;
                mseVar11.l = z2;
            }
            defpackage.mzv mzvVar = this.h;
            if (mzvVar != null) {
                int iT = mni.t(mzvVar);
                akzxVarM.u();
                defpackage.mse mseVar12 = (defpackage.mse) akzxVarM.b;
                mseVar12.m = iT - 1;
                mseVar12.b |= 256;
            }
            defpackage.nfb nfbVar = this.i;
            if (nfbVar != null) {
                int iV = mni.v(nfbVar);
                akzxVarM.u();
                defpackage.mse mseVar13 = (defpackage.mse) akzxVarM.b;
                mseVar13.o = iV - 1;
                mseVar13.b |= 512;
            }
            defpackage.igw igwVar = this.k;
            if (igwVar != null) {
                int i3 = igwVar.c;
                akzxVarM.u();
                defpackage.mse mseVar14 = (defpackage.mse) akzxVarM.b;
                mseVar14.b |= 1024;
                mseVar14.p = i3;
                java.lang.String str2 = igwVar.d;
                aooh.e(str2, "getSodaLpLocale(...)");
                aooh.f(str2, "value");
                akzxVarM.u();
                defpackage.mse mseVar15 = (defpackage.mse) akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                mseVar15.b |= 2048;
                mseVar15.q = str2;
            }
            java.util.List listUnmodifiableList3 = j$.util.DesugarCollections.unmodifiableList(((defpackage.mse) akzxVarM.b).n);
            aooh.e(listUnmodifiableList3, "getManualScreeningReplyC…lickedContentIdsList(...)");
            new alct(listUnmodifiableList3);
            java.util.List list3 = this.j;
            akzxVarM.u();
            defpackage.mse mseVar16 = (defpackage.mse) akzxVarM.b;
            alat alatVar3 = mseVar16.n;
            if (!alatVar3.c()) {
                mseVar16.n = alad.J(alatVar3);
            }
            akyl.i(list3, mseVar16.n);
            java.util.List list4 = this.l;
            if (!list4.isEmpty()) {
                java.util.List listUnmodifiableList4 = j$.util.DesugarCollections.unmodifiableList(((defpackage.mse) akzxVarM.b).r);
                aooh.e(listUnmodifiableList4, "getPostScreeningQuickRep…playedContentIdsList(...)");
                new alct(listUnmodifiableList4);
                akzxVarM.u();
                defpackage.mse mseVar17 = (defpackage.mse) akzxVarM.b;
                alat alatVar4 = mseVar17.r;
                if (!alatVar4.c()) {
                    mseVar17.r = alad.J(alatVar4);
                }
                akyl.i(list4, mseVar17.r);
            }
            java.lang.String str3 = this.m;
            if (str3 != null) {
                akzxVarM.u();
                defpackage.mse mseVar18 = (defpackage.mse) akzxVarM.b;
                j$.util.Objects.requireNonNull(str3);
                mseVar18.b |= 4096;
                mseVar18.s = str3;
            }
            java.util.List list5 = this.n;
            if (!list5.isEmpty()) {
                java.util.List listUnmodifiableList5 = j$.util.DesugarCollections.unmodifiableList(((defpackage.mse) akzxVarM.b).t);
                aooh.e(listUnmodifiableList5, "getLanguageDetectionEventsList(...)");
                new alct(listUnmodifiableList5);
                akzxVarM.u();
                defpackage.mse mseVar19 = (defpackage.mse) akzxVarM.b;
                alat alatVar5 = mseVar19.t;
                if (!alatVar5.c()) {
                    mseVar19.t = alad.J(alatVar5);
                }
                akyl.i(list5, mseVar19.t);
            }
            defpackage.mta mtaVar = this.o;
            if (mtaVar != null) {
                akzx akzxVarM4 = defpackage.msa.a.m();
                aooh.f(akzxVarM4, "builder");
                int iR = mni.r(mtaVar.a);
                akzxVarM4.u();
                defpackage.msa msaVar = (defpackage.msa) akzxVarM4.b;
                msaVar.c = iR - 1;
                msaVar.b |= 1;
                int iS = mni.s(mtaVar.b);
                akzxVarM4.u();
                defpackage.msa msaVar2 = (defpackage.msa) akzxVarM4.b;
                msaVar2.d = iS - 1;
                msaVar2.b |= 2;
                alad aladVarP3 = akzxVarM4.p();
                aooh.e(aladVarP3, "build(...)");
                defpackage.msa msaVar3 = (defpackage.msa) aladVarP3;
                aooh.f(msaVar3, "value");
                akzxVarM.u();
                defpackage.mse mseVar20 = (defpackage.mse) akzxVarM.b;
                j$.util.Objects.requireNonNull(msaVar3);
                mseVar20.u = msaVar3;
                mseVar20.b |= 8192;
            }
            java.lang.Boolean bool = this.p;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                akzxVarM.u();
                defpackage.mse mseVar21 = (defpackage.mse) akzxVarM.b;
                mseVar21.b |= 16384;
                mseVar21.v = zBooleanValue;
            }
            alad aladVarP4 = akzxVarM.p();
            aooh.e(aladVarP4, "build(...)");
            mseVar = (defpackage.mse) aladVarP4;
            return mseVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(boolean z, aoln aolnVar) {
        defpackage.mri mriVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mri) {
            mriVar = (defpackage.mri) aolnVar;
            int i = mriVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mriVar.d = i - Integer.MIN_VALUE;
            } else {
                mriVar = new defpackage.mri(this, aolnVar);
            }
        } else {
            mriVar = new defpackage.mri(this, aolnVar);
        }
        java.lang.Object obj = mriVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mriVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.q;
                mriVar.e = apdpVar2;
                mriVar.a = z;
                mriVar.d = 1;
                if (apdpVar2.b(mriVar) != aojhVar) {
                    apdpVar = apdpVar2;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = mriVar.a;
            apdpVar = mriVar.e;
            aooc.af(obj);
            this.p = java.lang.Boolean.valueOf(z);
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.igw igwVar, aoln aolnVar) {
        defpackage.mrj mrjVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mrj) {
            mrjVar = (defpackage.mrj) aolnVar;
            int i = mrjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrjVar.c = i - Integer.MIN_VALUE;
            } else {
                mrjVar = new defpackage.mrj(this, aolnVar);
            }
        } else {
            mrjVar = new defpackage.mrj(this, aolnVar);
        }
        java.lang.Object obj = mrjVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mrjVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.q;
                mrjVar.d = igwVar;
                mrjVar.e = apdpVar;
                mrjVar.c = 1;
                if (apdpVar.b(mrjVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mrjVar.e;
            defpackage.igw igwVar2 = mrjVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            igwVar = igwVar2;
            this.k = igwVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(alsj alsjVar, aoln aolnVar) {
        defpackage.mrk mrkVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mrk) {
            mrkVar = (defpackage.mrk) aolnVar;
            int i = mrkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrkVar.c = i - Integer.MIN_VALUE;
            } else {
                mrkVar = new defpackage.mrk(this, aolnVar);
            }
        } else {
            mrkVar = new defpackage.mrk(this, aolnVar);
        }
        java.lang.Object obj = mrkVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mrkVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.q;
                mrkVar.d = alsjVar;
                mrkVar.e = apdpVar;
                mrkVar.c = 1;
                if (apdpVar.b(mrkVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mrkVar.e;
            alsj alsjVar2 = mrkVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            alsjVar = alsjVar2;
            this.m = alsjVar.c;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(alsj alsjVar, aoln aolnVar) {
        defpackage.mrl mrlVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mrl) {
            mrlVar = (defpackage.mrl) aolnVar;
            int i = mrlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrlVar.c = i - Integer.MIN_VALUE;
            } else {
                mrlVar = new defpackage.mrl(this, aolnVar);
            }
        } else {
            mrlVar = new defpackage.mrl(this, aolnVar);
        }
        java.lang.Object obj = mrlVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mrlVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.q;
                mrlVar.d = alsjVar;
                mrlVar.e = apdpVar;
                mrlVar.c = 1;
                if (apdpVar.b(mrlVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mrlVar.e;
            alsj alsjVar2 = mrlVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            alsjVar = alsjVar2;
            this.l.add(alsjVar.c);
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.iht ihtVar, aoln aolnVar) {
        defpackage.mrm mrmVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mrm) {
            mrmVar = (defpackage.mrm) aolnVar;
            int i = mrmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrmVar.c = i - Integer.MIN_VALUE;
            } else {
                mrmVar = new defpackage.mrm(this, aolnVar);
            }
        } else {
            mrmVar = new defpackage.mrm(this, aolnVar);
        }
        java.lang.Object obj = mrmVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mrmVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.q;
                mrmVar.d = ihtVar;
                mrmVar.e = apdpVar;
                mrmVar.c = 1;
                if (apdpVar.b(mrmVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mrmVar.e;
            defpackage.iht ihtVar2 = mrmVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            ihtVar = ihtVar2;
            this.f = ihtVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(defpackage.mta mtaVar, aoln aolnVar) {
        defpackage.mrn mrnVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mrn) {
            mrnVar = (defpackage.mrn) aolnVar;
            int i = mrnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrnVar.c = i - Integer.MIN_VALUE;
            } else {
                mrnVar = new defpackage.mrn(this, aolnVar);
            }
        } else {
            mrnVar = new defpackage.mrn(this, aolnVar);
        }
        java.lang.Object obj = mrnVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mrnVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.q;
                mrnVar.d = mtaVar;
                mrnVar.e = apdpVar;
                mrnVar.c = 1;
                if (apdpVar.b(mrnVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mrnVar.e;
            defpackage.mta mtaVar2 = mrnVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            mtaVar = mtaVar2;
            this.o = mtaVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(defpackage.mzv mzvVar, aoln aolnVar) {
        defpackage.mro mroVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mro) {
            mroVar = (defpackage.mro) aolnVar;
            int i = mroVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mroVar.c = i - Integer.MIN_VALUE;
            } else {
                mroVar = new defpackage.mro(this, aolnVar);
            }
        } else {
            mroVar = new defpackage.mro(this, aolnVar);
        }
        java.lang.Object obj = mroVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mroVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.q;
                mroVar.d = mzvVar;
                mroVar.e = apdpVar;
                mroVar.c = 1;
                if (apdpVar.b(mroVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mroVar.e;
            defpackage.mzv mzvVar2 = mroVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            mzvVar = mzvVar2;
            this.h = mzvVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(defpackage.nvp nvpVar, long j, aoln aolnVar) {
        defpackage.mrp mrpVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mrp) {
            mrpVar = (defpackage.mrp) aolnVar;
            int i = mrpVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrpVar.d = i - Integer.MIN_VALUE;
            } else {
                mrpVar = new defpackage.mrp(this, aolnVar);
            }
        } else {
            mrpVar = new defpackage.mrp(this, aolnVar);
        }
        java.lang.Object obj = mrpVar.b;
        java.lang.Boolean boolValueOf = aolu.a;
        int i2 = mrpVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.q;
                mrpVar.e = nvpVar;
                mrpVar.f = apdpVar;
                mrpVar.a = j;
                mrpVar.d = 1;
                if (apdpVar.b(mrpVar) != boolValueOf) {
                }
                return boolValueOf;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = mrpVar.a;
            apdp apdpVar2 = mrpVar.f;
            defpackage.nvp nvpVar2 = mrpVar.e;
            aooc.af(obj);
            apdpVar = apdpVar2;
            nvpVar = nvpVar2;
            java.util.List list = this.a;
            akzx akzxVarM = defpackage.msb.a.m();
            aooh.f(akzxVarM, "builder");
            aooh.f(nvpVar, "value");
            akzxVarM.u();
            defpackage.msb msbVar = (defpackage.msb) akzxVarM.b;
            msbVar.d = nvpVar.bg;
            msbVar.b |= 2;
            akzxVarM.u();
            defpackage.msb msbVar2 = (defpackage.msb) akzxVarM.b;
            msbVar2.b |= 1;
            msbVar2.c = j;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            boolValueOf = java.lang.Boolean.valueOf(list.add((defpackage.msb) aladVarP));
            return boolValueOf;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(defpackage.nfb nfbVar, aoln aolnVar) {
        defpackage.mrq mrqVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mrq) {
            mrqVar = (defpackage.mrq) aolnVar;
            int i = mrqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrqVar.c = i - Integer.MIN_VALUE;
            } else {
                mrqVar = new defpackage.mrq(this, aolnVar);
            }
        } else {
            mrqVar = new defpackage.mrq(this, aolnVar);
        }
        java.lang.Object obj = mrqVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mrqVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.q;
                mrqVar.d = nfbVar;
                mrqVar.e = apdpVar;
                mrqVar.c = 1;
                if (apdpVar.b(mrqVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mrqVar.e;
            defpackage.nfb nfbVar2 = mrqVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            nfbVar = nfbVar2;
            this.i = nfbVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(nok nokVar, aoln aolnVar) {
        defpackage.mrr mrrVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mrr) {
            mrrVar = (defpackage.mrr) aolnVar;
            int i = mrrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrrVar.c = i - Integer.MIN_VALUE;
            } else {
                mrrVar = new defpackage.mrr(this, aolnVar);
            }
        } else {
            mrrVar = new defpackage.mrr(this, aolnVar);
        }
        java.lang.Object obj = mrrVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mrrVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.q;
                mrrVar.d = nokVar;
                mrrVar.e = apdpVar;
                mrrVar.c = 1;
                if (apdpVar.b(mrrVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mrrVar.e;
            nok nokVar2 = mrrVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            nokVar = nokVar2;
            this.g = nokVar;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object l(defpackage.msg msgVar, aoln aolnVar) {
        defpackage.mrs mrsVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mrs) {
            mrsVar = (defpackage.mrs) aolnVar;
            int i = mrsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrsVar.c = i - Integer.MIN_VALUE;
            } else {
                mrsVar = new defpackage.mrs(this, aolnVar);
            }
        } else {
            mrsVar = new defpackage.mrs(this, aolnVar);
        }
        java.lang.Object obj = mrsVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mrsVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.q;
                mrsVar.d = msgVar;
                mrsVar.e = apdpVar;
                mrsVar.c = 1;
                if (apdpVar.b(mrsVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mrsVar.e;
            defpackage.msg msgVar2 = mrsVar.d;
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
    public final java.lang.Object m(java.lang.String str, aoln aolnVar) {
        defpackage.mrt mrtVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mrt) {
            mrtVar = (defpackage.mrt) aolnVar;
            int i = mrtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrtVar.c = i - Integer.MIN_VALUE;
            } else {
                mrtVar = new defpackage.mrt(this, aolnVar);
            }
        } else {
            mrtVar = new defpackage.mrt(this, aolnVar);
        }
        java.lang.Object obj = mrtVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mrtVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.q;
                mrtVar.d = str;
                mrtVar.e = apdpVar;
                mrtVar.c = 1;
                if (apdpVar.b(mrtVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mrtVar.e;
            java.lang.String str2 = mrtVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            str = str2;
            this.e = str;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object n(alio alioVar, aoln aolnVar) {
        defpackage.mru mruVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mru) {
            mruVar = (defpackage.mru) aolnVar;
            int i = mruVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mruVar.c = i - Integer.MIN_VALUE;
            } else {
                mruVar = new defpackage.mru(this, aolnVar);
            }
        } else {
            mruVar = new defpackage.mru(this, aolnVar);
        }
        java.lang.Object obj = mruVar.a;
        java.lang.Boolean boolValueOf = aolu.a;
        int i2 = mruVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.q;
                mruVar.d = alioVar;
                mruVar.e = apdpVar;
                mruVar.c = 1;
                if (apdpVar.b(mruVar) != boolValueOf) {
                }
                return boolValueOf;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mruVar.e;
            alio alioVar2 = mruVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            alioVar = alioVar2;
            java.util.List list = this.b;
            defpackage.vk vkVarY = mni.Y(defpackage.mmz.a.m());
            akzx akzxVarM = defpackage.mna.a.m();
            aooh.f(akzxVarM, "builder");
            alti altiVar = alioVar.a;
            aooh.e(altiVar, "getReason(...)");
            aooh.f(altiVar, "value");
            akzxVarM.u();
            defpackage.mna mnaVar = (defpackage.mna) akzxVarM.b;
            mnaVar.d = altiVar.m;
            mnaVar.b |= 2;
            java.lang.String message = alioVar.getMessage();
            if (message == null) {
                message = "";
            }
            akzxVarM.u();
            defpackage.mna mnaVar2 = (defpackage.mna) akzxVarM.b;
            j$.util.Objects.requireNonNull(message);
            mnaVar2.b |= 1;
            mnaVar2.c = message;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.mna mnaVar3 = (defpackage.mna) aladVarP;
            aooh.f(mnaVar3, "value");
            java.lang.Object obj2 = vkVarY.a;
            ((akzx) obj2).u();
            defpackage.mmz mmzVar = (defpackage.mmz) ((akzx) obj2).b;
            j$.util.Objects.requireNonNull(mnaVar3);
            mmzVar.c = mnaVar3;
            mmzVar.b = 2;
            boolValueOf = java.lang.Boolean.valueOf(list.add(vkVarY.K()));
            return boolValueOf;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object o(altn altnVar, aoln aolnVar) {
        defpackage.mrv mrvVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mrv) {
            mrvVar = (defpackage.mrv) aolnVar;
            int i = mrvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrvVar.c = i - Integer.MIN_VALUE;
            } else {
                mrvVar = new defpackage.mrv(this, aolnVar);
            }
        } else {
            mrvVar = new defpackage.mrv(this, aolnVar);
        }
        java.lang.Object obj = mrvVar.a;
        java.lang.Boolean boolValueOf = aolu.a;
        int i2 = mrvVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.q;
                mrvVar.d = altnVar;
                mrvVar.e = apdpVar;
                mrvVar.c = 1;
                if (apdpVar.b(mrvVar) != boolValueOf) {
                }
                return boolValueOf;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mrvVar.e;
            altn altnVar2 = mrvVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            altnVar = altnVar2;
            java.util.List list = this.b;
            defpackage.vk vkVarY = mni.Y(defpackage.mmz.a.m());
            aooh.f(altnVar, "value");
            java.lang.Object obj2 = vkVarY.a;
            ((akzx) obj2).u();
            defpackage.mmz mmzVar = (defpackage.mmz) ((akzx) obj2).b;
            j$.util.Objects.requireNonNull(altnVar);
            mmzVar.c = altnVar;
            mmzVar.b = 1;
            boolValueOf = java.lang.Boolean.valueOf(list.add(vkVarY.K()));
            return boolValueOf;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object p(alxy alxyVar, aoln aolnVar) {
        defpackage.mrw mrwVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mrw) {
            mrwVar = (defpackage.mrw) aolnVar;
            int i = mrwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrwVar.c = i - Integer.MIN_VALUE;
            } else {
                mrwVar = new defpackage.mrw(this, aolnVar);
            }
        } else {
            mrwVar = new defpackage.mrw(this, aolnVar);
        }
        java.lang.Object obj = mrwVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mrwVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.q;
                mrwVar.d = alxyVar;
                mrwVar.e = apdpVar;
                mrwVar.c = 1;
                if (apdpVar.b(mrwVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mrwVar.e;
            alxy alxyVar2 = mrwVar.d;
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
    public final java.lang.Object q(tvx tvxVar, aoln aolnVar) {
        defpackage.mrx mrxVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mrx) {
            mrxVar = (defpackage.mrx) aolnVar;
            int i = mrxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrxVar.c = i - Integer.MIN_VALUE;
            } else {
                mrxVar = new defpackage.mrx(this, aolnVar);
            }
        } else {
            mrxVar = new defpackage.mrx(this, aolnVar);
        }
        java.lang.Object obj = mrxVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mrxVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.q;
                mrxVar.d = tvxVar;
                mrxVar.e = apdpVar;
                mrxVar.c = 1;
                if (apdpVar.b(mrxVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mrxVar.e;
            tvx tvxVar2 = mrxVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            tvxVar = tvxVar2;
            this.n.add(tvxVar);
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object r(java.lang.String str, aoln aolnVar) {
        defpackage.mry mryVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.mry) {
            mryVar = (defpackage.mry) aolnVar;
            int i = mryVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mryVar.c = i - Integer.MIN_VALUE;
            } else {
                mryVar = new defpackage.mry(this, aolnVar);
            }
        } else {
            mryVar = new defpackage.mry(this, aolnVar);
        }
        java.lang.Object obj = mryVar.a;
        aojh aojhVar = aolu.a;
        int i2 = mryVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.q;
                mryVar.d = str;
                mryVar.e = apdpVar;
                mryVar.c = 1;
                if (apdpVar.b(mryVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = mryVar.e;
            java.lang.String str2 = mryVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            str = str2;
            this.j.add(str);
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            apdpVar.d();
        }
    }
}
