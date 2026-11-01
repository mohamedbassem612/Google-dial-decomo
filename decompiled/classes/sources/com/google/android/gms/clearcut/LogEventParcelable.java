package com.google.android.gms.clearcut;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class LogEventParcelable extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.zzr();
    private static final java.lang.String[] p = new java.lang.String[0];
    public final com.google.android.gms.clearcut.internal.PlayLoggerContext a;
    public final byte[] b;
    public final int[] c;
    public final java.lang.String[] d;
    public final int[] e;
    public final byte[][] f;
    public final com.google.android.gms.phenotype.ExperimentTokens[] g;
    public final boolean h;
    public com.google.android.gms.clearcut.internal.LogVerifierResultParcelable i;
    public final int j;
    public final com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable k;
    public com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable l;
    public final byte[] m;
    public final java.lang.Long n;
    public final defpackage.amua o;
    private final java.lang.String[] q;

    public LogEventParcelable(com.google.android.gms.clearcut.internal.PlayLoggerContext playLoggerContext, byte[] bArr, int[] iArr, java.lang.String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, com.google.android.gms.phenotype.ExperimentTokens[] experimentTokensArr, com.google.android.gms.clearcut.internal.LogVerifierResultParcelable logVerifierResultParcelable, java.lang.String[] strArr2, int i, com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable dataCollectionIdentifierParcelable, com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable batchedLogErrorParcelable, byte[] bArr3, java.lang.Long l) {
        this.a = playLoggerContext;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = bArr2;
        this.h = z;
        this.g = experimentTokensArr;
        this.i = logVerifierResultParcelable;
        this.q = strArr2;
        this.j = i;
        this.o = null;
        this.k = dataCollectionIdentifierParcelable;
        this.l = batchedLogErrorParcelable;
        this.m = bArr3;
        this.n = l;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.clearcut.LogEventParcelable) {
            com.google.android.gms.clearcut.LogEventParcelable logEventParcelable = (com.google.android.gms.clearcut.LogEventParcelable) obj;
            if (j$.util.Objects.equals(this.a, logEventParcelable.a) && java.util.Arrays.equals(this.b, logEventParcelable.b) && java.util.Arrays.equals(this.c, logEventParcelable.c) && java.util.Arrays.equals(this.d, logEventParcelable.d) && j$.util.Objects.equals(this.o, logEventParcelable.o) && java.util.Arrays.equals(this.e, logEventParcelable.e) && java.util.Arrays.deepEquals(this.f, logEventParcelable.f) && java.util.Arrays.equals(this.g, logEventParcelable.g) && java.util.Arrays.equals(this.q, logEventParcelable.q) && this.h == logEventParcelable.h && j$.util.Objects.equals(this.i, logEventParcelable.i) && this.j == logEventParcelable.j && j$.util.Objects.equals(this.k, logEventParcelable.k) && j$.util.Objects.equals(this.l, logEventParcelable.l) && java.util.Arrays.equals(this.m, logEventParcelable.m) && j$.util.Objects.equals(this.n, logEventParcelable.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.b)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.c)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.d)), this.o, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.e)), java.lang.Integer.valueOf(java.util.Arrays.deepHashCode(this.f)), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.g)), java.lang.Boolean.valueOf(this.h), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.q)), this.i, java.lang.Integer.valueOf(this.j), this.k, this.l, java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.m)), this.n});
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LogEventParcelable[");
        sb.append(this.a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? null : new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
        sb.append(", TestCodes: ");
        sb.append(java.util.Arrays.toString(this.c));
        sb.append(", MendelPackages: ");
        sb.append(java.util.Arrays.toString(this.d));
        sb.append(", LogEvent: ");
        sb.append(this.o);
        sb.append(", , ExperimentIDs: ");
        sb.append(java.util.Arrays.toString(this.e));
        sb.append(", ExperimentTokens: ");
        sb.append(java.util.Arrays.deepToString(this.f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(java.util.Arrays.toString(this.g));
        sb.append(", MendelPackagesToFilter: ");
        sb.append(java.util.Arrays.toString(this.q));
        sb.append("AddPhenotypeExperimentTokens: ");
        sb.append(this.h);
        sb.append(", LogVerifierResult: ");
        com.google.android.gms.clearcut.internal.LogVerifierResultParcelable logVerifierResultParcelable = this.i;
        sb.append(logVerifierResultParcelable != null ? logVerifierResultParcelable.toString() : null);
        sb.append("EventCode: ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.l);
        sb.append(", ");
        sb.append(java.util.Arrays.toString(this.m));
        sb.append(", ");
        sb.append(this.n);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.clearcut.internal.PlayLoggerContext playLoggerContext = this.a;
        int iF = defpackage.aais.f(parcel, 20293);
        defpackage.aais.z(parcel, 2, playLoggerContext, i);
        byte[] bArr = this.b;
        if (bArr != null) {
            int iF2 = defpackage.aais.f(parcel, 3);
            parcel.writeByteArray(bArr);
            defpackage.aais.g(parcel, iF2);
        }
        int[] iArr = this.c;
        if (iArr != null) {
            int iF3 = defpackage.aais.f(parcel, 4);
            parcel.writeIntArray(iArr);
            defpackage.aais.g(parcel, iF3);
        }
        java.lang.String[] strArr = this.d;
        if (strArr != null) {
            int iF4 = defpackage.aais.f(parcel, 5);
            parcel.writeStringArray(strArr);
            defpackage.aais.g(parcel, iF4);
        }
        int[] iArr2 = this.e;
        if (iArr2 != null) {
            int iF5 = defpackage.aais.f(parcel, 6);
            parcel.writeIntArray(iArr2);
            defpackage.aais.g(parcel, iF5);
        }
        defpackage.aais.r(parcel, 7, this.f);
        boolean z = this.h;
        parcel.writeInt(262152);
        parcel.writeInt(z ? 1 : 0);
        defpackage.aais.D(parcel, 9, this.g, i);
        defpackage.aais.z(parcel, 11, this.i, i);
        java.lang.String[] strArr2 = this.q;
        if (strArr2 == null) {
            strArr2 = p;
        }
        int iF6 = defpackage.aais.f(parcel, 12);
        parcel.writeStringArray(strArr2);
        defpackage.aais.g(parcel, iF6);
        int i2 = this.j;
        parcel.writeInt(262157);
        parcel.writeInt(i2);
        defpackage.aais.z(parcel, 14, this.k, i);
        defpackage.aais.z(parcel, 15, this.l, i);
        byte[] bArr2 = this.m;
        if (bArr2 != null) {
            int iF7 = defpackage.aais.f(parcel, 16);
            parcel.writeByteArray(bArr2);
            defpackage.aais.g(parcel, iF7);
        }
        defpackage.aais.y(parcel, 17, this.n);
        defpackage.aais.g(parcel, iF);
    }

    public LogEventParcelable(com.google.android.gms.clearcut.internal.PlayLoggerContext playLoggerContext, defpackage.amua amuaVar, byte[] bArr, int[] iArr, java.lang.String[] strArr, int[] iArr2, com.google.android.gms.phenotype.ExperimentTokens[] experimentTokensArr, java.lang.String[] strArr2, int i, java.lang.Long l) {
        this.a = playLoggerContext;
        this.o = amuaVar;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = null;
        this.g = experimentTokensArr;
        this.h = true;
        this.q = strArr2;
        this.j = i;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
    }
}
