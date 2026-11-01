package com.android.onboarding.contracts.annotations;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface OnboardingNode {
    public static final defpackage.xga a = defpackage.xga.a;

    int a() default -1;

    long b() default 300;

    defpackage.xfs c() default @defpackage.xfs(b = {"allow_default"});

    defpackage.xft d() default @defpackage.xft(a = true);

    defpackage.xfy e() default @defpackage.xfy(b = defpackage.xfx.INVISIBLE, c = true);

    defpackage.xgc f() default defpackage.xgc.LIGHT;

    java.lang.String g();

    java.lang.String h();

    boolean i() default false;

    java.lang.Class[] j() default {};

    java.lang.String[] k() default {};
}
