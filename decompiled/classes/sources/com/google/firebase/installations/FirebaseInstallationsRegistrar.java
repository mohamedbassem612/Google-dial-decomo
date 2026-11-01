package com.google.firebase.installations;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class FirebaseInstallationsRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final java.lang.String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ defpackage.ajwi lambda$getComponents$0(defpackage.ajtq ajtqVar) {
        return new defpackage.ajwh((defpackage.ajtc) ajtqVar.e(defpackage.ajtc.class), ajtqVar.b(defpackage.ajvs.class), (java.util.concurrent.ExecutorService) ajtqVar.d(new defpackage.ajui(defpackage.ajtj.class, java.util.concurrent.ExecutorService.class)), new defpackage.ajuu((java.util.concurrent.Executor) ajtqVar.d(new defpackage.ajui(defpackage.ajtk.class, java.util.concurrent.Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List getComponents() {
        defpackage.ajto ajtoVarB = defpackage.ajtp.b(defpackage.ajwi.class);
        ajtoVarB.a = LIBRARY_NAME;
        ajtoVarB.b(new defpackage.ajtx(defpackage.ajtc.class, 1, 0));
        ajtoVarB.b(new defpackage.ajtx(defpackage.ajvs.class, 0, 1));
        ajtoVarB.b(new defpackage.ajtx(new defpackage.ajui(defpackage.ajtj.class, java.util.concurrent.ExecutorService.class), 1, 0));
        ajtoVarB.b(new defpackage.ajtx(new defpackage.ajui(defpackage.ajtk.class, java.util.concurrent.Executor.class), 1, 0));
        ajtoVarB.c = new defpackage.ajus(9);
        return java.util.Arrays.asList(ajtoVarB.a(), defpackage.ajtp.d(new defpackage.ajvr(), defpackage.ajvq.class), defpackage.ajsz.aa(LIBRARY_NAME, "19.1.1_1p"));
    }
}
