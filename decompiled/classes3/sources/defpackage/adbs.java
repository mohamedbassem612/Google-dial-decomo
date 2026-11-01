package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class adbs implements ajas {
    public final /* synthetic */ android.content.Context a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ defpackage.acvr d;
    public final /* synthetic */ defpackage.acvu e;
    public final /* synthetic */ aogc f;

    public /* synthetic */ adbs(android.content.Context context, java.lang.String str, long j, aogc aogcVar, defpackage.acvr acvrVar, defpackage.acvu acvuVar) {
        this.a = context;
        this.b = str;
        this.c = j;
        this.f = aogcVar;
        this.d = acvrVar;
        this.e = acvuVar;
    }

    public final ajcq a() throws defpackage.adbt {
        java.lang.String message = "";
        android.content.Context context = this.a;
        java.lang.String str = this.b;
        long j = this.c;
        aogc aogcVar = this.f;
        defpackage.acvr acvrVar = this.d;
        defpackage.acvu acvuVar = this.e;
        int i = 0;
        try {
            ahzf ahzfVar = defpackage.afek.a;
            java.io.OutputStream outputStream = (java.io.OutputStream) aogcVar.M(aehj.N(java.lang.String.valueOf(str).concat(".lease"), context.getPackageName(), j), new afft());
            if (outputStream != null) {
                outputStream.close();
            }
        } catch (java.io.IOException unused) {
            adbe.e("%s: Failed to acquire lease for file %s, file group %s", new java.lang.Object[]{"AndroidSharingUtil", acvrVar.c, acvuVar.d});
            message = java.lang.String.format("Error while acquiring lease for file %s, group %s", acvrVar.c, acvuVar.d);
            i = 20;
        } catch (afex unused2) {
            adbe.e("%s: Malformed lease uri file %s, file group %s", new java.lang.Object[]{"AndroidSharingUtil", acvrVar.c, acvuVar.d});
            message = java.lang.String.format("Malformed lease Uri for file %s, group %s", acvrVar.c, acvuVar.d);
            i = 18;
        } catch (defpackage.afet unused3) {
            adbe.e("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", new java.lang.Object[]{"AndroidSharingUtil", acvrVar.c, acvuVar.d});
            message = java.lang.String.format("System limit exceeded for file %s, group %s", acvrVar.c, acvuVar.d);
            i = 25;
        } catch (affa e) {
            message = android.text.TextUtils.isEmpty(e.getMessage()) ? "" : e.getMessage();
            java.lang.String str2 = acvrVar.c;
            java.lang.String str3 = acvuVar.d;
            int i2 = adbe.a;
            message = "UnsupportedFileStorageOperation was thrown: ".concat(java.lang.String.valueOf(message));
            i = 24;
        }
        if (i == 0) {
            return ajcm.a;
        }
        throw new defpackage.adbt(i, message);
    }
}
