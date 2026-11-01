package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class yj {
    public yj() {
        new java.util.concurrent.atomic.AtomicReference(null);
    }

    public static long a(defpackage.als alsVar) {
        return ((long) (alsVar.f() + alsVar.g())) * 1000000;
    }

    public static final void b(cmw cmwVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        cmw cmwVar2;
        aonn aonnVar2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(771959668);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != cbtVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D((java.lang.Object) null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(aonnVar) ? 128 : 256;
        }
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cdu.b);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR = parcelableSnapshotMutableState;
            }
            ccp ccpVar = (ccp) objR;
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == obj) {
                objR2 = new defpackage.bhl(ccpVar, i4);
                cbtVar.ab(objR2);
            }
            cmwVar2 = cmwVar;
            aonnVar2 = aonnVar;
            den.ab(defpackage.bix.b.b(d((aomy) objR2, cbtVarB)), cfo.j(-291176396, new defpackage.ata((java.lang.Object) cmwVar2, (java.lang.Object) ccpVar, (java.lang.Object) aonnVar2, 2, (byte[]) null), cbtVarB), cbtVarB, 48);
        } else {
            cmwVar2 = cmwVar;
            aonnVar2 = aonnVar;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.amv(cmwVar2, aonnVar2, i, 7);
        }
    }

    public static final void c(cmw cmwVar, aonn aonnVar, cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(2064964257);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            b(cmwVar, aonnVar, cavVarB, (i2 & 14) | 48 | ((i2 << 3) & 896));
        } else {
            cavVarB.s();
        }
        cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.amv(cmwVar, aonnVar, i, 6);
        }
    }

    public static final defpackage.biw d(aomy aomyVar, cav cavVar) {
        android.view.View view = (android.view.View) cavVar.e(dep.f);
        boolean zB = cavVar.B(view);
        cbt cbtVar = (cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        if (zB || objR == cau.a) {
            objR = new defpackage.bhq(view, aomyVar);
            cbtVar.ab(objR);
        }
        defpackage.bhq bhqVar = (defpackage.bhq) objR;
        boolean zD = cavVar.D(bhqVar);
        java.lang.Object objR2 = cbtVar.R();
        if (zD || objR2 == cau.a) {
            objR2 = new defpackage.bgf(bhqVar, 9);
            cbtVar.ab(objR2);
        }
        cbp.c(bhqVar, (aonj) objR2, cavVar);
        return bhqVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e A[LOOP:0: B:20:0x0050->B:23:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:17:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(cwc r7, aoln r8) {
        /*
            boolean r0 = r8 instanceof defpackage.bhk
            if (r0 == 0) goto L13
            r0 = r8
            bhk r0 = (defpackage.bhk) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            bhk r0 = new bhk
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            aolu r1 = aolu.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cwc r7 = r0.c
            aooc.af(r8)
            goto L40
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            aooc.af(r8)
        L34:
            r0.c = r7
            r0.b = r3
            cvg r8 = defpackage.cvg.b
            java.lang.Object r8 = r7.r(r8, r0)
            if (r8 == r1) goto L65
        L40:
            cvf r8 = (cvf) r8
            int r2 = r8.c
            r2 = r2 & 66
            if (r2 == 0) goto L34
            java.util.List r8 = r8.a
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L50:
            if (r5 >= r2) goto L61
            java.lang.Object r6 = r8.get(r5)
            cvm r6 = (defpackage.cvm) r6
            boolean r6 = uu.q(r6)
            if (r6 == 0) goto L34
            int r5 = r5 + 1
            goto L50
        L61:
            java.lang.Object r1 = r8.get(r4)
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.e(cwc, aoln):java.lang.Object");
    }

    public static final java.lang.String f(dnb dnbVar, android.content.Context context) {
        float fC;
        dpe.m(context);
        int iBn = mni.bn(context);
        if (iBn == 0) {
            return dpy.c(dnbVar.a, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, new defpackage.dkq(4), 31);
        }
        java.util.List list = dnbVar.a;
        int size = list.size();
        java.lang.String strConcat = "";
        boolean z = false;
        for (int i = 0; i < size; i++) {
            dmy dmyVar = (dmy) list.get(i);
            if (aooh.n(dmyVar.a(), "wght")) {
                fC = aooc.s(dmyVar.c() + iBn, 1.0f, 1000.0f);
                z = true;
            } else {
                fC = dmyVar.c();
            }
            if (i != 0) {
                strConcat = strConcat.concat(",");
            }
            strConcat = ((java.lang.Object) strConcat) + '\'' + dmyVar.a() + "' " + fC;
        }
        if (z) {
            return strConcat;
        }
        float fS = aooc.s(iBn + 400.0f, 1.0f, 1000.0f);
        if (!list.isEmpty()) {
            strConcat = strConcat.concat(",");
        }
        return ((java.lang.Object) strConcat) + "'wght' " + fS;
    }

    public static /* synthetic */ dmp g(java.lang.String str, dnd dndVar) {
        return new defpackage.dmo(str, dndVar, new dnb(new dmy[0]));
    }

    public static /* synthetic */ dmp h(defpackage.vk vkVar, defpackage.dnn dnnVar, dnd dndVar) {
        dnb dnbVar = new dnb(new dmy[0]);
        java.util.List list = dnbVar.a;
        if (list.size() > 1) {
            int size = list.size() - 1;
            int i = 0;
            while (i < size) {
                java.lang.String strA = ((dmy) list.get(i)).a();
                i++;
                if (strA.compareTo(((dmy) list.get(i)).a()) > 0) {
                    dmy[] dmyVarArr = (dmy[]) ajsz.bX(list, new defpackage.djh(3)).toArray(new dmy[0]);
                    dnbVar = new dnb((dmy[]) java.util.Arrays.copyOf(dmyVarArr, dmyVarArr.length));
                    break;
                }
            }
        }
        return new defpackage.dno((java.lang.String) vkVar.a, dnnVar, dndVar, dnbVar);
    }
}
