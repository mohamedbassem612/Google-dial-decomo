package com.google.firebase.iid;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class Registrar implements com.google.firebase.components.ComponentRegistrar {
    public static /* synthetic */ com.google.firebase.iid.FirebaseInstanceId lambda$getComponents$0(defpackage.ajtq ajtqVar) {
        defpackage.ajtc ajtcVar = (defpackage.ajtc) ajtqVar.e(defpackage.ajtc.class);
        return new com.google.firebase.iid.FirebaseInstanceId(ajtcVar, new defpackage.ajwa(ajtcVar.a()), defpackage.ajvv.a(), defpackage.ajvv.a(), ajtqVar.b(defpackage.ajyn.class), ajtqVar.b(defpackage.ajvt.class), (defpackage.ajwi) ajtqVar.e(defpackage.ajwi.class));
    }

    public static /* synthetic */ defpackage.ajwd lambda$getComponents$1(defpackage.ajtq ajtqVar) {
        return new defpackage.ajwb((com.google.firebase.iid.FirebaseInstanceId) ajtqVar.e(com.google.firebase.iid.FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List getComponents() {
        defpackage.ajto ajtoVarB = defpackage.ajtp.b(com.google.firebase.iid.FirebaseInstanceId.class);
        ajtoVarB.b(new defpackage.ajtx(defpackage.ajtc.class, 1, 0));
        ajtoVarB.b(new defpackage.ajtx(defpackage.ajyn.class, 0, 1));
        ajtoVarB.b(new defpackage.ajtx(defpackage.ajvt.class, 0, 1));
        ajtoVarB.b(new defpackage.ajtx(defpackage.ajwi.class, 1, 0));
        ajtoVarB.c = new defpackage.ajus(7);
        ajtoVarB.c();
        defpackage.ajtp ajtpVarA = ajtoVarB.a();
        defpackage.ajto ajtoVarB2 = defpackage.ajtp.b(defpackage.ajwd.class);
        ajtoVarB2.b(new defpackage.ajtx(com.google.firebase.iid.FirebaseInstanceId.class, 1, 0));
        ajtoVarB2.c = new defpackage.ajus(8);
        return java.util.Arrays.asList(ajtpVarA, ajtoVarB2.a(), defpackage.ajsz.aa("fire-iid", "21.1.1"));
    }
}
