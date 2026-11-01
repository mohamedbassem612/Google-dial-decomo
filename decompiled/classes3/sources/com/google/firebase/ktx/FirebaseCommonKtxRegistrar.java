package com.google.firebase.ktx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class FirebaseCommonKtxRegistrar implements com.google.firebase.components.ComponentRegistrar {
    public java.util.List getComponents() {
        ajto ajtoVarA = ajtp.a(new ajui(ajtj.class, aosp.class));
        ajtoVarA.b(new ajtx(new ajui(ajtj.class, java.util.concurrent.Executor.class), 1, 0));
        ajtoVarA.c = defpackage.ajtd.e;
        ajto ajtoVarA2 = ajtp.a(new ajui(ajtl.class, aosp.class));
        ajtoVarA2.b(new ajtx(new ajui(ajtl.class, java.util.concurrent.Executor.class), 1, 0));
        ajtoVarA2.c = defpackage.ajtd.f;
        ajto ajtoVarA3 = ajtp.a(new ajui(ajtk.class, aosp.class));
        ajtoVarA3.b(new ajtx(new ajui(ajtk.class, java.util.concurrent.Executor.class), 1, 0));
        ajtoVarA3.c = defpackage.ajtd.g;
        ajto ajtoVarA4 = ajtp.a(new ajui(ajtm.class, aosp.class));
        ajtoVarA4.b(new ajtx(new ajui(ajtm.class, java.util.concurrent.Executor.class), 1, 0));
        ajtoVarA4.c = defpackage.ajtd.h;
        return ajsz.bb(new ajtp[]{ajtoVarA.a(), ajtoVarA2.a(), ajtoVarA3.a(), ajtoVarA4.a()});
    }
}
