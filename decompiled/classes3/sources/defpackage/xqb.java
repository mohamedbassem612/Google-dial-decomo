package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface xqb {
    long a();

    long b() default -1;

    defpackage.xqc c();

    defpackage.xqd d() default defpackage.xqd.a;

    java.lang.String e() default "NOT_AVAILABLE";

    java.lang.String f();

    java.lang.String g() default "NOT_RELEASED";

    defpackage.xqa[] h();

    java.lang.String[] i() default {};
}
