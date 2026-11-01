package com.google.firebase.concurrent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ExecutorsRegistrar implements com.google.firebase.components.ComponentRegistrar {
    public static final defpackage.ajuc a = new defpackage.ajuc(new defpackage.ajur(0));
    public static final defpackage.ajuc b = new defpackage.ajuc(new defpackage.ajur(2));
    public static final defpackage.ajuc c = new defpackage.ajuc(new defpackage.ajur(3));
    static final defpackage.ajuc d = new defpackage.ajuc(new defpackage.ajur(4));

    public static java.util.concurrent.ScheduledExecutorService a(java.util.concurrent.ExecutorService executorService) {
        return new defpackage.ajuo(executorService, (java.util.concurrent.ScheduledExecutorService) d.a());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final java.util.List getComponents() {
        defpackage.ajto ajtoVar = new defpackage.ajto(new defpackage.ajui(defpackage.ajtj.class, java.util.concurrent.ScheduledExecutorService.class), new defpackage.ajui(defpackage.ajtj.class, java.util.concurrent.ExecutorService.class), new defpackage.ajui(defpackage.ajtj.class, java.util.concurrent.Executor.class));
        ajtoVar.c = new defpackage.ajus(1);
        defpackage.ajto ajtoVar2 = new defpackage.ajto(new defpackage.ajui(defpackage.ajtk.class, java.util.concurrent.ScheduledExecutorService.class), new defpackage.ajui(defpackage.ajtk.class, java.util.concurrent.ExecutorService.class), new defpackage.ajui(defpackage.ajtk.class, java.util.concurrent.Executor.class));
        ajtoVar2.c = new defpackage.ajus(0);
        defpackage.ajto ajtoVar3 = new defpackage.ajto(new defpackage.ajui(defpackage.ajtl.class, java.util.concurrent.ScheduledExecutorService.class), new defpackage.ajui(defpackage.ajtl.class, java.util.concurrent.ExecutorService.class), new defpackage.ajui(defpackage.ajtl.class, java.util.concurrent.Executor.class));
        ajtoVar3.c = new defpackage.ajus(2);
        defpackage.ajto ajtoVarA = defpackage.ajtp.a(new defpackage.ajui(defpackage.ajtm.class, java.util.concurrent.Executor.class));
        ajtoVarA.c = new defpackage.ajus(3);
        return java.util.Arrays.asList(ajtoVar.a(), ajtoVar2.a(), ajtoVar3.a(), ajtoVarA.a());
    }
}
