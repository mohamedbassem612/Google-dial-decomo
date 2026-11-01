package com.google.firebase.messaging;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class FirebaseMessagingRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final java.lang.String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ com.google.firebase.messaging.FirebaseMessaging lambda$getComponents$0(defpackage.ajui ajuiVar, defpackage.ajtq ajtqVar) {
        defpackage.ajtc ajtcVar = (defpackage.ajtc) ajtqVar.e(defpackage.ajtc.class);
        defpackage.ajwd ajwdVar = (defpackage.ajwd) ajtqVar.e(defpackage.ajwd.class);
        defpackage.ajwe ajweVarB = ajtqVar.b(defpackage.ajyn.class);
        defpackage.ajwe ajweVarB2 = ajtqVar.b(defpackage.ajvt.class);
        defpackage.ajwi ajwiVar = (defpackage.ajwi) ajtqVar.e(defpackage.ajwi.class);
        defpackage.ajwe ajweVarA = ajtqVar.a(ajuiVar);
        defpackage.ajvo ajvoVar = (defpackage.ajvo) ajtqVar.e(defpackage.ajvo.class);
        defpackage.ajxo ajxoVar = new defpackage.ajxo(ajtcVar.a());
        return new com.google.firebase.messaging.FirebaseMessaging(ajtcVar, ajwdVar, ajweVarA, ajvoVar, ajxoVar, new defpackage.ajxm(ajtcVar, ajxoVar, new defpackage.aabo(ajtcVar.a()), ajweVarB, ajweVarB2, ajwiVar), ajwiVar, defpackage.ajsz.H(), new java.util.concurrent.ScheduledThreadPoolExecutor(1, new defpackage.aaiv("Firebase-Messaging-Init")), new java.util.concurrent.ThreadPoolExecutor(0, 1, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new defpackage.aaiv("Firebase-Messaging-File-Io")));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List getComponents() {
        defpackage.ajui ajuiVar = new defpackage.ajui(defpackage.ajux.class, defpackage.zia.class);
        defpackage.ajto ajtoVarB = defpackage.ajtp.b(com.google.firebase.messaging.FirebaseMessaging.class);
        ajtoVarB.a = LIBRARY_NAME;
        ajtoVarB.b(new defpackage.ajtx(defpackage.ajtc.class, 1, 0));
        ajtoVarB.b(new defpackage.ajtx(defpackage.ajwd.class, 0, 0));
        ajtoVarB.b(new defpackage.ajtx(defpackage.ajyn.class, 0, 1));
        ajtoVarB.b(new defpackage.ajtx(defpackage.ajvt.class, 0, 1));
        ajtoVarB.b(new defpackage.ajtx(defpackage.ajwi.class, 1, 0));
        ajtoVarB.b(new defpackage.ajtx(ajuiVar, 0, 1));
        ajtoVarB.b(new defpackage.ajtx(defpackage.ajvo.class, 1, 0));
        ajtoVarB.c = new defpackage.ajtn(ajuiVar, 3);
        ajtoVarB.c();
        return java.util.Arrays.asList(ajtoVarB.a(), defpackage.ajsz.aa(LIBRARY_NAME, "25.1.2_1p"));
    }
}
