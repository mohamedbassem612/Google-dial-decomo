package com.google.firebase.datatransport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class TransportRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final java.lang.String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ defpackage.zia lambda$getComponents$0(defpackage.ajtq ajtqVar) {
        zid.b((android.content.Context) ajtqVar.e(android.content.Context.class));
        return zid.a().c();
    }

    public static /* synthetic */ defpackage.zia lambda$getComponents$1(defpackage.ajtq ajtqVar) {
        zid.b((android.content.Context) ajtqVar.e(android.content.Context.class));
        return zid.a().c();
    }

    public static /* synthetic */ defpackage.zia lambda$getComponents$2(defpackage.ajtq ajtqVar) {
        zid.b((android.content.Context) ajtqVar.e(android.content.Context.class));
        return zid.a().c();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public java.util.List getComponents() {
        defpackage.ajto ajtoVarB = defpackage.ajtp.b(defpackage.zia.class);
        ajtoVarB.a = LIBRARY_NAME;
        ajtoVarB.b(new defpackage.ajtx(android.content.Context.class, 1, 0));
        ajtoVarB.c = new defpackage.ajus(4);
        defpackage.ajto ajtoVarA = defpackage.ajtp.a(new defpackage.ajui(defpackage.ajuw.class, defpackage.zia.class));
        ajtoVarA.b(new defpackage.ajtx(android.content.Context.class, 1, 0));
        ajtoVarA.c = new defpackage.ajus(5);
        defpackage.ajto ajtoVarA2 = defpackage.ajtp.a(new defpackage.ajui(defpackage.ajux.class, defpackage.zia.class));
        ajtoVarA2.b(new defpackage.ajtx(android.content.Context.class, 1, 0));
        ajtoVarA2.c = new defpackage.ajus(6);
        return java.util.Arrays.asList(ajtoVarB.a(), ajtoVarA.a(), ajtoVarA2.a(), defpackage.ajsz.aa(LIBRARY_NAME, "19.0.0_1p"));
    }
}
