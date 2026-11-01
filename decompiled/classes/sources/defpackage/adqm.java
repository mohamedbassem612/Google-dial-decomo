package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adqm extends defpackage.adql {
    private static final defpackage.aimz b = defpackage.aimz.i("com/google/android/libraries/micore/telephony/common/audiomessages/MigratingLocalCacheAudioFileProvider");
    private final defpackage.adqk c;

    public adqm(defpackage.adqk adqkVar, defpackage.adqj adqjVar) {
        super(adqjVar);
        this.c = adqkVar;
    }

    @Override // defpackage.adql, defpackage.adqq
    public final j$.util.Optional c(defpackage.adnv adnvVar) {
        j$.util.Optional optionalC = super.c(adnvVar);
        if (optionalC.isPresent()) {
            return optionalC;
        }
        java.lang.String str = adnvVar.a;
        java.lang.String str2 = adnvVar.b;
        defpackage.adqk adqkVar = this.c;
        java.lang.String string = adqkVar.a.toString();
        if (str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("invalid empty voiceId");
        }
        java.io.File file = j$.nio.file.Path.-CC.of(string, new java.lang.String[]{java.lang.String.format("%08x-%s", java.lang.Integer.valueOf(str.hashCode()), defpackage.adqk.a(str)), java.lang.String.format(java.util.Locale.US, "%d-%08x-%s.%s", 0, java.lang.Integer.valueOf(str2.hashCode()), defpackage.adqk.a(str2), adqkVar.b)}).toFile();
        if (!file.isFile()) {
            return j$.util.Optional.empty();
        }
        try {
            java.io.File fileB = this.a.b(str, str2);
            try {
                ((defpackage.aimw) ((defpackage.aimw) b.b()).l("com/google/android/libraries/micore/telephony/common/audiomessages/MigratingLocalCacheAudioFileProvider", "migrateFile", 79, "MigratingLocalCacheAudioFileProvider.java")).y("Moving audio file for message %s from old to new cache", adnvVar);
                if (file == null || fileB == null) {
                    throw null;
                }
                defpackage.ahvr.bW(!file.equals(fileB), "Source %s and destination %s must be different", file, fileB);
                if (!file.renameTo(fileB)) {
                    defpackage.aisq.a(file, fileB);
                    if (!file.delete()) {
                        if (fileB.delete()) {
                            throw new java.io.IOException("Unable to delete ".concat(file.toString()));
                        }
                        throw new java.io.IOException("Unable to delete ".concat(fileB.toString()));
                    }
                }
                return j$.util.Optional.of(fileB);
            } catch (java.io.IOException e) {
                defpackage.aimz aimzVar = b;
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.d()).k(e)).l("com/google/android/libraries/micore/telephony/common/audiomessages/MigratingLocalCacheAudioFileProvider", "migrateFile", 84, "MigratingLocalCacheAudioFileProvider.java")).y("Failed to move file '%s', fallback to copy", file.getAbsolutePath());
                try {
                    ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/google/android/libraries/micore/telephony/common/audiomessages/MigratingLocalCacheAudioFileProvider", "migrateFile", 88, "MigratingLocalCacheAudioFileProvider.java")).y("Copying audio file for message %s from old to new cache", adnvVar);
                    defpackage.aisq.a(file, fileB);
                    try {
                        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/google/android/libraries/micore/telephony/common/audiomessages/MigratingLocalCacheAudioFileProvider", "migrateFile", 98, "MigratingLocalCacheAudioFileProvider.java")).y("Deleting old cache file '%s' after successful copy", file.getAbsolutePath());
                        if (!file.delete()) {
                            ((defpackage.aimw) ((defpackage.aimw) aimzVar.d()).l("com/google/android/libraries/micore/telephony/common/audiomessages/MigratingLocalCacheAudioFileProvider", "migrateFile", 101, "MigratingLocalCacheAudioFileProvider.java")).y("Failed to delete file '%s' from old cache", file.getAbsolutePath());
                        }
                    } catch (java.lang.SecurityException e2) {
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) b.d()).k(e2)).l("com/google/android/libraries/micore/telephony/common/audiomessages/MigratingLocalCacheAudioFileProvider", "migrateFile", 105, "MigratingLocalCacheAudioFileProvider.java")).y("Failed to delete file '%s' from old cache", file.getAbsolutePath());
                    }
                } catch (java.io.IOException e3) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) b.d()).k(e3)).l("com/google/android/libraries/micore/telephony/common/audiomessages/MigratingLocalCacheAudioFileProvider", "migrateFile", 92, "MigratingLocalCacheAudioFileProvider.java")).y("Failed to copy file '%s' to new cache", file.getAbsolutePath());
                    return j$.util.Optional.of(file);
                }
            }
        } catch (java.io.IOException e4) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) b.d()).k(e4)).l("com/google/android/libraries/micore/telephony/common/audiomessages/MigratingLocalCacheAudioFileProvider", "getFile", 58, "MigratingLocalCacheAudioFileProvider.java")).y("Failed to create path of audio file for message %s in the new cache", adnvVar);
            return j$.util.Optional.of(file);
        }
    }
}
