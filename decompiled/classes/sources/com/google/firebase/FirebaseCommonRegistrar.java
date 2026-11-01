package com.google.firebase;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class FirebaseCommonRegistrar implements com.google.firebase.components.ComponentRegistrar {
    public static java.lang.String a(java.lang.String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final java.util.List getComponents() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.ajto ajtoVarB = defpackage.ajtp.b(defpackage.ajyn.class);
        final int i = 2;
        final int i2 = 0;
        ajtoVarB.b(new defpackage.ajtx(defpackage.ajyl.class, 2, 0));
        ajtoVarB.c = new defpackage.ajus(10);
        arrayList.add(ajtoVarB.a());
        defpackage.ajui ajuiVar = new defpackage.ajui(defpackage.ajtj.class, java.util.concurrent.Executor.class);
        final int i3 = 1;
        defpackage.ajto ajtoVar = new defpackage.ajto(defpackage.ajvp.class, defpackage.ajvs.class, defpackage.ajvt.class);
        ajtoVar.b(new defpackage.ajtx(android.content.Context.class, 1, 0));
        ajtoVar.b(new defpackage.ajtx(defpackage.ajtc.class, 1, 0));
        ajtoVar.b(new defpackage.ajtx(defpackage.ajvq.class, 2, 0));
        ajtoVar.b(new defpackage.ajtx(defpackage.ajyn.class, 1, 1));
        ajtoVar.b(new defpackage.ajtx(ajuiVar, 1, 0));
        ajtoVar.c = new defpackage.ajtn(ajuiVar, i);
        arrayList.add(ajtoVar.a());
        arrayList.add(defpackage.ajsz.aa("fire-android", java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT)));
        arrayList.add(defpackage.ajsz.aa("fire-core", "23.0.0_1p"));
        arrayList.add(defpackage.ajsz.aa("device-name", a(android.os.Build.PRODUCT)));
        arrayList.add(defpackage.ajsz.aa("device-model", a(android.os.Build.DEVICE)));
        arrayList.add(defpackage.ajsz.aa("device-brand", a(android.os.Build.BRAND)));
        arrayList.add(defpackage.ajsz.ab("android-target-sdk", new defpackage.ajym() { // from class: ajte
            @Override // defpackage.ajym
            public final java.lang.String a(java.lang.Object obj) {
                int i4 = i3;
                if (i4 == 0) {
                    android.content.pm.ApplicationInfo applicationInfo = ((android.content.Context) obj).getApplicationInfo();
                    return applicationInfo != null ? java.lang.String.valueOf(aa$.ExternalSyntheticApiModelOutline1.m(applicationInfo)) : "";
                }
                if (i4 == 1) {
                    android.content.pm.ApplicationInfo applicationInfo2 = ((android.content.Context) obj).getApplicationInfo();
                    return applicationInfo2 != null ? java.lang.String.valueOf(applicationInfo2.targetSdkVersion) : "";
                }
                if (i4 != 2) {
                    android.content.Context context = (android.content.Context) obj;
                    java.lang.String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    return installerPackageName != null ? com.google.firebase.FirebaseCommonRegistrar.a(installerPackageName) : "";
                }
                android.content.Context context2 = (android.content.Context) obj;
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    return "auto";
                }
                return context2.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            }
        }));
        arrayList.add(defpackage.ajsz.ab("android-min-sdk", new defpackage.ajym() { // from class: ajte
            @Override // defpackage.ajym
            public final java.lang.String a(java.lang.Object obj) {
                int i4 = i2;
                if (i4 == 0) {
                    android.content.pm.ApplicationInfo applicationInfo = ((android.content.Context) obj).getApplicationInfo();
                    return applicationInfo != null ? java.lang.String.valueOf(aa$.ExternalSyntheticApiModelOutline1.m(applicationInfo)) : "";
                }
                if (i4 == 1) {
                    android.content.pm.ApplicationInfo applicationInfo2 = ((android.content.Context) obj).getApplicationInfo();
                    return applicationInfo2 != null ? java.lang.String.valueOf(applicationInfo2.targetSdkVersion) : "";
                }
                if (i4 != 2) {
                    android.content.Context context = (android.content.Context) obj;
                    java.lang.String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    return installerPackageName != null ? com.google.firebase.FirebaseCommonRegistrar.a(installerPackageName) : "";
                }
                android.content.Context context2 = (android.content.Context) obj;
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    return "auto";
                }
                return context2.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            }
        }));
        arrayList.add(defpackage.ajsz.ab("android-platform", new defpackage.ajym() { // from class: ajte
            @Override // defpackage.ajym
            public final java.lang.String a(java.lang.Object obj) {
                int i4 = i;
                if (i4 == 0) {
                    android.content.pm.ApplicationInfo applicationInfo = ((android.content.Context) obj).getApplicationInfo();
                    return applicationInfo != null ? java.lang.String.valueOf(aa$.ExternalSyntheticApiModelOutline1.m(applicationInfo)) : "";
                }
                if (i4 == 1) {
                    android.content.pm.ApplicationInfo applicationInfo2 = ((android.content.Context) obj).getApplicationInfo();
                    return applicationInfo2 != null ? java.lang.String.valueOf(applicationInfo2.targetSdkVersion) : "";
                }
                if (i4 != 2) {
                    android.content.Context context = (android.content.Context) obj;
                    java.lang.String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    return installerPackageName != null ? com.google.firebase.FirebaseCommonRegistrar.a(installerPackageName) : "";
                }
                android.content.Context context2 = (android.content.Context) obj;
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    return "auto";
                }
                return context2.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            }
        }));
        final int i4 = 3;
        arrayList.add(defpackage.ajsz.ab("android-installer", new defpackage.ajym() { // from class: ajte
            @Override // defpackage.ajym
            public final java.lang.String a(java.lang.Object obj) {
                int i5 = i4;
                if (i5 == 0) {
                    android.content.pm.ApplicationInfo applicationInfo = ((android.content.Context) obj).getApplicationInfo();
                    return applicationInfo != null ? java.lang.String.valueOf(aa$.ExternalSyntheticApiModelOutline1.m(applicationInfo)) : "";
                }
                if (i5 == 1) {
                    android.content.pm.ApplicationInfo applicationInfo2 = ((android.content.Context) obj).getApplicationInfo();
                    return applicationInfo2 != null ? java.lang.String.valueOf(applicationInfo2.targetSdkVersion) : "";
                }
                if (i5 != 2) {
                    android.content.Context context = (android.content.Context) obj;
                    java.lang.String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    return installerPackageName != null ? com.google.firebase.FirebaseCommonRegistrar.a(installerPackageName) : "";
                }
                android.content.Context context2 = (android.content.Context) obj;
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                    return "tv";
                }
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    return "watch";
                }
                if (context2.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                    return "auto";
                }
                return context2.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            }
        }));
        return arrayList;
    }
}
