package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class blj extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(aoln aolnVar, hvy hvyVar, android.speech.tts.TextToSpeech.OnInitListener onInitListener, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = hvyVar;
        this.c = onInitListener;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 4:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 5:
                return c((aows) obj, (aoln) obj2).b(aojh.a);
            case 6:
                return c((aows) obj, (aoln) obj2).b(aojh.a);
            case 7:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 8:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 9:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 10:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 11:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 12:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 16:
                return c((defpackage.jfg) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return c((defpackage.kdy) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:279:0x080b  */
    /* JADX WARN: Code duplicated, block: B:320:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v15, types: [android.speech.tts.TextToSpeech$OnInitListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v10, types: [cvr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [cvr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v50, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v79, types: [aolr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [cvr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v25, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v28, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v9, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [aoss, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v57 java.lang.Object, still in use, count: 2, list:
          (r1v57 java.lang.Object) from 0x0806: PHI (r1 I:??) = (r1v55 java.lang.Object), (r1v57 java.lang.Object) binds: [B:276:0x0805, B:290:0x0806] A[DONT_GENERATE, DONT_INLINE]
          (r1v57 java.lang.Object) from 0x07fe: CHECK_CAST (lmz) (r1v57 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final java.lang.Object b(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 2110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blj.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [cvr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16, types: [android.speech.tts.TextToSpeech$OnInitListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [cvr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [cvr, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                defpackage.blj bljVar = new defpackage.blj((cer) this.b, (aii) this.c, aolnVar, 0);
                bljVar.d = obj;
                return bljVar;
            case 1:
                defpackage.blj bljVar2 = new defpackage.blj((cvr) this.b, (defpackage.aul) this.c, aolnVar, 1);
                bljVar2.d = obj;
                return bljVar2;
            case 2:
                defpackage.blj bljVar3 = new defpackage.blj((kaw) this.c, (defpackage.bpq) this.b, aolnVar, 2);
                bljVar3.d = obj;
                return bljVar3;
            case 3:
                defpackage.blj bljVar4 = new defpackage.blj((cvr) this.b, (defpackage.bwj) this.c, aolnVar, 3);
                bljVar4.d = obj;
                return bljVar4;
            case 4:
                defpackage.blj bljVar5 = new defpackage.blj((cvr) this.b, (defpackage.bwj) this.c, aolnVar, 4, (byte[]) null);
                bljVar5.d = obj;
                return bljVar5;
            case 5:
                defpackage.blj bljVar6 = new defpackage.blj((defpackage.gqb) this.b, (android.content.Context) this.c, aolnVar, 5);
                bljVar6.d = obj;
                return bljVar6;
            case 6:
                defpackage.blj bljVar7 = new defpackage.blj((grn) this.c, (gvo) this.b, aolnVar, 6);
                bljVar7.d = obj;
                return bljVar7;
            case 7:
                defpackage.blj bljVar8 = new defpackage.blj((defpackage.hnx) this.c, (apqr) this.b, aolnVar, 7);
                bljVar8.d = obj;
                return bljVar8;
            case 8:
                defpackage.blj bljVar9 = new defpackage.blj(aolnVar, (hvy) this.b, (android.speech.tts.TextToSpeech.OnInitListener) this.c, 8);
                bljVar9.d = obj;
                return bljVar9;
            case 9:
                defpackage.blj bljVar10 = new defpackage.blj((defpackage.hxg) this.c, (defpackage.hxv) this.b, aolnVar, 9);
                bljVar10.d = obj;
                return bljVar10;
            case 10:
                defpackage.blj bljVar11 = new defpackage.blj(aolnVar, (defpackage.iir) this.b, (defpackage.igb) this.c, 10);
                bljVar11.d = obj;
                return bljVar11;
            case 11:
                defpackage.blj bljVar12 = new defpackage.blj((igf) this.c, (defpackage.iix) this.b, aolnVar, 11);
                bljVar12.d = obj;
                return bljVar12;
            case 12:
                defpackage.blj bljVar13 = new defpackage.blj((defpackage.ijt) this.b, (defpackage.ihu) this.c, aolnVar, 12);
                bljVar13.d = obj;
                return bljVar13;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.blj bljVar14 = new defpackage.blj((defpackage.ijt) this.b, (defpackage.ihw) this.c, aolnVar, 13);
                bljVar14.d = obj;
                return bljVar14;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.blj bljVar15 = new defpackage.blj((igs) this.c, (ils) this.b, aolnVar, 14);
                bljVar15.d = obj;
                return bljVar15;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.blj bljVar16 = new defpackage.blj((igs) this.c, (rsr) this.b, aolnVar, 15);
                bljVar16.d = obj;
                return bljVar16;
            case 16:
                defpackage.blj bljVar17 = new defpackage.blj((defpackage.hxe) this.b, (defpackage.hxe) this.c, aolnVar, 16);
                bljVar17.d = obj;
                return bljVar17;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                defpackage.blj bljVar18 = new defpackage.blj((defpackage.jjw) this.c, (defpackage.jjx) this.b, aolnVar, 17);
                bljVar18.d = obj;
                return bljVar18;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                defpackage.blj bljVar19 = new defpackage.blj((defpackage.jjw) this.c, (defpackage.jjx) this.b, aolnVar, 18, (byte[]) null);
                bljVar19.d = obj;
                return bljVar19;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                defpackage.blj bljVar20 = new defpackage.blj((tkl) this.c, (kiu) this.b, aolnVar, 19);
                bljVar20.d = obj;
                return bljVar20;
            default:
                defpackage.blj bljVar21 = new defpackage.blj((defpackage.lnh) this.b, (defpackage.lmq) this.c, aolnVar, 20);
                bljVar21.d = obj;
                return bljVar21;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(aoln aolnVar, defpackage.iir iirVar, defpackage.igb igbVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = iirVar;
        this.c = igbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(cer cerVar, aii aiiVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = cerVar;
        this.c = aiiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(cvr cvrVar, defpackage.aul aulVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = cvrVar;
        this.c = aulVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(cvr cvrVar, defpackage.bwj bwjVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = cvrVar;
        this.c = bwjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(cvr cvrVar, defpackage.bwj bwjVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = cvrVar;
        this.c = bwjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(defpackage.gqb gqbVar, android.content.Context context, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = gqbVar;
        this.c = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(grn grnVar, gvo gvoVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = grnVar;
        this.b = gvoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(defpackage.hnx hnxVar, apqr apqrVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = hnxVar;
        this.b = apqrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(defpackage.hxe hxeVar, defpackage.hxe hxeVar2, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = hxeVar;
        this.c = hxeVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(defpackage.hxg hxgVar, defpackage.hxv hxvVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = hxgVar;
        this.b = hxvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(igf igfVar, defpackage.iix iixVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = igfVar;
        this.b = iixVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(igs igsVar, ils ilsVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = igsVar;
        this.b = ilsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(igs igsVar, rsr rsrVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = igsVar;
        this.b = rsrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(defpackage.ijt ijtVar, defpackage.ihu ihuVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ijtVar;
        this.c = ihuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(defpackage.ijt ijtVar, defpackage.ihw ihwVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ijtVar;
        this.c = ihwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(defpackage.jjw jjwVar, defpackage.jjx jjxVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = jjwVar;
        this.b = jjxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(defpackage.jjw jjwVar, defpackage.jjx jjxVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = jjwVar;
        this.b = jjxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(kaw kawVar, defpackage.bpq bpqVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = kawVar;
        this.b = bpqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(defpackage.lnh lnhVar, defpackage.lmq lmqVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = lnhVar;
        this.c = lmqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blj(tkl tklVar, kiu kiuVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = tklVar;
        this.b = kiuVar;
    }
}
