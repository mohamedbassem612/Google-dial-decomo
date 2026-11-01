package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dmu extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(defpackage.ajcq ajcqVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ajcqVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Exception {
        switch (this.$cid) {
            case 0:
                return ((defpackage.dmu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 1:
                return ((defpackage.dmu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 2:
                return ((defpackage.dmu) c((defpackage.aoxi) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 3:
                return ((defpackage.dmu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 4:
                return ((defpackage.dmu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 5:
                return ((defpackage.dmu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.dmu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aoln aolnVarC = c((defpackage.aoss) obj, (defpackage.aoln) obj2);
                defpackage.aojh aojhVar = defpackage.aojh.a;
                ((defpackage.dmu) aolnVarC).b(aojhVar);
                return aojhVar;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.dmu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 9:
                return ((defpackage.dmu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 10:
                return ((defpackage.dmu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 11:
                return ((defpackage.dmu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 12:
                return ((defpackage.dmu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 13:
                return ((defpackage.dmu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 14:
                return ((defpackage.dmu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 15:
                return ((defpackage.dmu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 16:
                return ((defpackage.dmu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 17:
                return ((defpackage.dmu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 18:
                return ((defpackage.dmu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 19:
                return ((defpackage.dmu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            default:
                return ((defpackage.dmu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v100, types: [aoxh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v56, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v59, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [cvr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v70, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v91, types: [aoxh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v97, types: [aoxh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [aoxh, java.lang.Object] */
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
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        java.lang.Object objAx;
        java.lang.Object objC;
        java.lang.Object objI;
        java.lang.Object objI2;
        switch (this.$cid) {
            case 0:
                defpackage.aolu aoluVar = defpackage.aolu.a;
                int i = this.a;
                defpackage.aooc.af(obj);
                if (i == 0) {
                    java.lang.Object obj2 = this.b;
                    this.a = 1;
                    if (((dmi) obj2).b(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return defpackage.aojh.a;
            case 1:
                defpackage.aolu aoluVar2 = defpackage.aolu.a;
                if (this.a != 0) {
                    defpackage.aooc.af(obj);
                } else {
                    defpackage.aooc.af(obj);
                    ?? r1 = this.b;
                    androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler = ((defpackage.cwd) r1).d;
                    this.a = 2;
                    if (pointerInputEventHandler.invoke(r1, this) == aoluVar2) {
                        return aoluVar2;
                    }
                }
                return defpackage.aojh.a;
            case 2:
                defpackage.aolu aoluVar3 = defpackage.aolu.a;
                int i2 = this.a;
                defpackage.aooc.af(obj);
                if (i2 == 0) {
                    java.lang.Object obj3 = this.b;
                    this.a = 1;
                    if (((defpackage.eei) obj3).e(this) == aoluVar3) {
                        return aoluVar3;
                    }
                }
                return defpackage.aojh.a;
            case 3:
                defpackage.aolu aoluVar4 = defpackage.aolu.a;
                int i3 = this.a;
                defpackage.aooc.af(obj);
                if (i3 != 0) {
                    if (i3 == 1) {
                    }
                    return defpackage.aojh.a;
                }
                java.lang.Object obj4 = this.b;
                this.a = 1;
                java.lang.Object objFI = ((defpackage.eei) obj4).f.a.fI(this);
                if (objFI != aoluVar4) {
                    objFI = defpackage.aojh.a;
                }
                if (objFI == aoluVar4) {
                    return aoluVar4;
                }
                defpackage.eei eeiVar = (defpackage.eei) this.b;
                defpackage.aoxh aoxhVarAD = defpackage.aoov.aD(eeiVar.o().c, -1);
                defpackage.edn ednVar = new defpackage.edn(eeiVar);
                this.a = 2;
                if (aoxhVarAD.fM(ednVar, this) == aoluVar4) {
                    return aoluVar4;
                }
                return defpackage.aojh.a;
            case 4:
                defpackage.aolu aoluVar5 = defpackage.aolu.a;
                int i4 = this.a;
                defpackage.aooc.af(obj);
                if (i4 != 0) {
                    objAx = obj;
                } else {
                    java.lang.Object obj5 = this.b;
                    defpackage.gac gacVar = defpackage.gac.c;
                    defpackage.gbl gblVar = (defpackage.gbl) obj5;
                    defpackage.ipc ipcVar = gblVar.h;
                    defpackage.aoxh aoxhVarB = defpackage.aoyc.b(ipcVar.D(gacVar), ipcVar.D(defpackage.gac.b));
                    defpackage.bpj bpjVar = new defpackage.bpj(gblVar, (defpackage.aoln) null, 3);
                    this.a = 1;
                    objAx = defpackage.aoov.ax(aoxhVarB, bpjVar, this);
                    if (objAx == aoluVar5) {
                        return aoluVar5;
                    }
                }
                defpackage.gds gdsVar = (defpackage.gds) objAx;
                if (gdsVar != null) {
                    java.lang.Object obj6 = this.b;
                    if (defpackage.dzn.j(3)) {
                        defpackage.dzn.k(3, "Jump triggered on PagingSource " + ((defpackage.gbl) obj6).a + " by " + gdsVar);
                    }
                    ((defpackage.gbl) obj6).d.a();
                }
                return defpackage.aojh.a;
            case 5:
                defpackage.aolu aoluVar6 = defpackage.aolu.a;
                int i5 = this.a;
                defpackage.aooc.af(obj);
                if (i5 == 0) {
                    java.lang.Object obj7 = this.b;
                    this.a = 1;
                    if (((defpackage.gat) obj7).g(this) == aoluVar6) {
                        return aoluVar6;
                    }
                }
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aolu aoluVar7 = defpackage.aolu.a;
                int i6 = this.a;
                defpackage.aooc.af(obj);
                if (i6 == 0) {
                    java.lang.Object obj8 = this.b;
                    this.a = 1;
                    if (((defpackage.gat) obj8).f(this) == aoluVar7) {
                        return aoluVar7;
                    }
                }
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                int i7 = this.a;
                defpackage.aooc.af(obj);
                if (i7 == 0) {
                    this.a = 1;
                    throw new java.lang.IllegalStateException("Not implemented");
                }
                return obj;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aolu aoluVar8 = defpackage.aolu.a;
                int i8 = this.a;
                defpackage.aooc.af(obj);
                if (i8 == 0) {
                    java.lang.Object obj9 = this.b;
                    this.a = 1;
                    objC = ((androidx.work.CoroutineWorker) obj9).c(this);
                    if (objC == aoluVar8) {
                        return aoluVar8;
                    }
                    return objC;
                }
                return obj;
            case 9:
                defpackage.aolu aoluVar9 = defpackage.aolu.a;
                int i9 = this.a;
                defpackage.aooc.af(obj);
                if (i9 == 0) {
                    java.lang.Object obj10 = this.b;
                    this.a = 1;
                    objC = ((androidx.work.impl.workers.ConstraintTrackingWorker) obj10).k(this);
                    if (objC == aoluVar9) {
                        return aoluVar9;
                    }
                    return objC;
                }
                return obj;
            case 10:
                defpackage.aolu aoluVar10 = defpackage.aolu.a;
                int i10 = this.a;
                defpackage.aooc.af(obj);
                if (i10 != 0) {
                    objI = obj;
                } else {
                    java.lang.Object obj11 = this.b;
                    this.a = 1;
                    objI = ((kvt) obj11).i(this);
                    if (objI == aoluVar10) {
                        return aoluVar10;
                    }
                }
                return defpackage.ahvr.bv((java.util.Collection) objI);
            case 11:
                defpackage.aolu aoluVar11 = defpackage.aolu.a;
                int i11 = this.a;
                defpackage.aooc.af(obj);
                if (i11 == 0) {
                    ?? r2 = this.b;
                    this.a = 1;
                    objC = defpackage.aosv.D(r2, this);
                    if (objC == aoluVar11) {
                        return aoluVar11;
                    }
                    return objC;
                }
                return obj;
            case 12:
                defpackage.aolu aoluVar12 = defpackage.aolu.a;
                int i12 = this.a;
                defpackage.aooc.af(obj);
                if (i12 == 0) {
                    ?? r3 = this.b;
                    this.a = 1;
                    objC = defpackage.aosv.D(r3, this);
                    if (objC == aoluVar12) {
                        return aoluVar12;
                    }
                    return objC;
                }
                return obj;
            case 13:
                defpackage.aolu aoluVar13 = defpackage.aolu.a;
                try {
                    if (this.a != 0) {
                        defpackage.aooc.af(obj);
                        objI2 = obj;
                    } else {
                        defpackage.aooc.af(obj);
                        defpackage.ojo ojoVar = ((hmq) this.b).e;
                        android.net.Uri uri = hmq.a;
                        defpackage.aooh.e(uri, "access$getPHONE_DEDUP_CONTENT_URI$cp(...)");
                        java.lang.String[] strArr = hmq.b;
                        hmp hmpVar = hmp.a;
                        this.a = 1;
                        int i13 = defpackage.ojo.f;
                        objI2 = ojoVar.i(uri, strArr, null, null, "sort_key ASC", hmpVar, this);
                        if (objI2 == aoluVar13) {
                            return aoluVar13;
                        }
                    }
                    return (defpackage.aify) objI2;
                } catch (java.lang.RuntimeException e) {
                    ((defpackage.aimw) ((defpackage.aimw) hmq.c.d()).k(e).l("com/android/dialer/androidauto/impl/contacts/ContactsRepository", "getContacts$<anonymous>", 51, "ContactsRepository.kt")).v("getContacts failed");
                    throw e;
                }
            case 14:
                defpackage.aolu aoluVar14 = defpackage.aolu.a;
                int i14 = this.a;
                defpackage.aooc.af(obj);
                if (i14 == 0) {
                    ?? r4 = this.b;
                    this.a = 1;
                    objC = defpackage.aosv.D(r4, this);
                    if (objC == aoluVar14) {
                        return aoluVar14;
                    }
                    return objC;
                }
                return obj;
            case 15:
                defpackage.aolu aoluVar15 = defpackage.aolu.a;
                int i15 = this.a;
                defpackage.aooc.af(obj);
                if (i15 == 0) {
                    hnm hnmVar = (hnm) this.b;
                    hnx hnxVar = hnmVar.o;
                    if (hnxVar == null) {
                        return defpackage.aojh.a;
                    }
                    hnj hnjVar = new hnj(hnmVar, (defpackage.aoln) null, 0);
                    this.a = 1;
                    if (defpackage.aoov.aF(hnxVar.a, hnjVar, this) == aoluVar15) {
                        return aoluVar15;
                    }
                }
                throw new java.lang.IllegalStateException("SharedFlow never completes, this call should never return.");
            case 16:
                defpackage.aolu aoluVar16 = defpackage.aolu.a;
                int i16 = this.a;
                defpackage.aooc.af(obj);
                if (i16 == 0) {
                    hnm hnmVar2 = (hnm) this.b;
                    defpackage.aoyp aoypVar = new defpackage.aoyp(hnmVar2.f.a, hnmVar2.g.a, new aro((defpackage.aoln) null, 4, (int[]) null));
                    hnk hnkVar = new hnk(hnmVar2, (defpackage.aoln) null);
                    this.a = 1;
                    if (defpackage.aoov.aF(aoypVar, hnkVar, this) == aoluVar16) {
                        return aoluVar16;
                    }
                }
                return defpackage.aojh.a;
            case 17:
                defpackage.aolu aoluVar17 = defpackage.aolu.a;
                int i17 = this.a;
                defpackage.aooc.af(obj);
                if (i17 == 0) {
                    hnm hnmVar3 = (hnm) this.b;
                    hnl hnlVar = new hnl(hnmVar3, (defpackage.aoln) null);
                    this.a = 1;
                    if (defpackage.aoov.aF(hnmVar3.e.a, hnlVar, this) == aoluVar17) {
                        return aoluVar17;
                    }
                }
                throw new java.lang.IllegalStateException("SharedFlow never completes, this call should never return.");
            case 18:
                defpackage.aolu aoluVar18 = defpackage.aolu.a;
                int i18 = this.a;
                defpackage.aooc.af(obj);
                if (i18 == 0) {
                    hnm hnmVar4 = (hnm) this.b;
                    auk aukVar = new auk(hnmVar4, (defpackage.aoln) null, 2);
                    this.a = 1;
                    if (defpackage.aoov.aF(hnmVar4.r.a, aukVar, this) == aoluVar18) {
                        return aoluVar18;
                    }
                }
                throw new java.lang.IllegalStateException("SharedFlow never completes, this call should never return.");
            case 19:
                defpackage.aolu aoluVar19 = defpackage.aolu.a;
                int i19 = this.a;
                defpackage.aooc.af(obj);
                if (i19 == 0) {
                    hnm hnmVar5 = (hnm) this.b;
                    auk aukVar2 = new auk(hnmVar5, (defpackage.aoln) null, 3, (byte[]) null);
                    this.a = 1;
                    if (defpackage.aoov.aF(hnmVar5.s.a, aukVar2, this) == aoluVar19) {
                        return aoluVar19;
                    }
                }
                throw new java.lang.IllegalStateException("SharedFlow never completes, this call should never return.");
            default:
                defpackage.aolu aoluVar20 = defpackage.aolu.a;
                int i20 = this.a;
                defpackage.aooc.af(obj);
                if (i20 == 0) {
                    hnm hnmVar6 = (hnm) this.b;
                    auk aukVar3 = new auk(hnmVar6, (defpackage.aoln) null, 4, (char[]) null);
                    this.a = 1;
                    if (defpackage.aoov.aF(hnmVar6.r.a, aukVar3, this) == aoluVar20) {
                        return aoluVar20;
                    }
                }
                throw new java.lang.IllegalStateException("SharedFlow never completes, this call should never return.");
        }
    }

    /* JADX WARN: Type inference failed for: r2v23, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [ajcq, java.lang.Object] */
    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.dmu((dmi) this.b, aolnVar, 0);
            case 1:
                return new defpackage.dmu((defpackage.cwd) this.b, aolnVar, 1);
            case 2:
                return new defpackage.dmu((defpackage.eei) this.b, aolnVar, 2);
            case 3:
                return new defpackage.dmu((defpackage.eei) this.b, aolnVar, 3, (byte[]) null);
            case 4:
                return new defpackage.dmu((defpackage.gbl) this.b, aolnVar, 4);
            case 5:
                return new defpackage.dmu((defpackage.gat) this.b, aolnVar, 5);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return new defpackage.dmu((defpackage.gat) this.b, aolnVar, 6, (byte[]) null);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.dmu((androidx.work.CoroutineWorker) this.b, aolnVar, 7);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.dmu((androidx.work.CoroutineWorker) this.b, aolnVar, 8, (byte[]) null);
            case 9:
                return new defpackage.dmu((androidx.work.impl.workers.ConstraintTrackingWorker) this.b, aolnVar, 9);
            case 10:
                return new defpackage.dmu((kvt) this.b, aolnVar, 10);
            case 11:
                return new defpackage.dmu((defpackage.ajcq) this.b, aolnVar, 11);
            case 12:
                return new defpackage.dmu((defpackage.ajcq) this.b, aolnVar, 12, (byte[]) null);
            case 13:
                return new defpackage.dmu((hmq) this.b, aolnVar, 13);
            case 14:
                return new defpackage.dmu((defpackage.ajcq) this.b, aolnVar, 14, (char[]) null);
            case 15:
                return new defpackage.dmu((hnm) this.b, aolnVar, 15);
            case 16:
                return new defpackage.dmu((hnm) this.b, aolnVar, 16, (byte[]) null);
            case 17:
                return new defpackage.dmu((hnm) this.b, aolnVar, 17, (char[]) null);
            case 18:
                return new defpackage.dmu((hnm) this.b, aolnVar, 18, (short[]) null);
            case 19:
                return new defpackage.dmu((hnm) this.b, aolnVar, 19, (int[]) null);
            default:
                return new defpackage.dmu((hnm) this.b, aolnVar, 20, (boolean[]) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(defpackage.ajcq ajcqVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ajcqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(defpackage.ajcq ajcqVar, defpackage.aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ajcqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(androidx.work.CoroutineWorker coroutineWorker, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = coroutineWorker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(androidx.work.CoroutineWorker coroutineWorker, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = coroutineWorker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(androidx.work.impl.workers.ConstraintTrackingWorker constraintTrackingWorker, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = constraintTrackingWorker;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(defpackage.cwd cwdVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = cwdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(dmi dmiVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = dmiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(defpackage.eei eeiVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = eeiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(defpackage.eei eeiVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = eeiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(defpackage.gat gatVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = gatVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(defpackage.gat gatVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = gatVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(defpackage.gbl gblVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = gblVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(hmq hmqVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = hmqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(hnm hnmVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = hnmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(hnm hnmVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = hnmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(hnm hnmVar, defpackage.aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = hnmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(hnm hnmVar, defpackage.aoln aolnVar, int i, int[] iArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = hnmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(hnm hnmVar, defpackage.aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = hnmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(hnm hnmVar, defpackage.aoln aolnVar, int i, boolean[] zArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = hnmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmu(kvt kvtVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = kvtVar;
    }
}
