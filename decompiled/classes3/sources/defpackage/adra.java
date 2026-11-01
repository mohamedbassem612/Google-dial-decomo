package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adra {
    public static final aimz a = aimz.i("com/google/android/libraries/micore/telephony/common/resourcemanagers/superpacks/SuperpacksUtils");

    public static aify a(java.io.File file) {
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            return (aify) j$.util.DesugarArrays.stream(fileArrListFiles).filter(new defpackage.zun(5)).collect(aido.a);
        }
        a.c().l("com/google/android/libraries/micore/telephony/common/resourcemanagers/superpacks/SuperpacksUtils", "getSubdirectories", 118, "SuperpacksUtils.java").y("Error listing files for base superpacks directory: %s.", file);
        return aike.a;
    }
}
