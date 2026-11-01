package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xpx {
    public static final java.lang.String a = "2023-07-05";
    private static final j$.time.LocalDate c;
    public final j$.time.LocalDate b;

    static {
        j$.time.LocalDate localDate = j$.time.LocalDate.parse("2023-07-05");
        c = localDate;
        aooh.e(localDate, "EARLIEST_COMPLIANCE_DATE_LOCALDATE");
        new defpackage.xpx(localDate);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    /* JADX WARN: Illegal instructions before constructor call */
    public xpx(java.lang.String str) {
        j$.time.LocalDate localDate = j$.time.LocalDate.parse(str);
        if (localDate != null) {
            localDate = true == localDate.isBefore(c) ? null : localDate;
            localDate = localDate == null ? c : localDate;
        }
        aooh.c(localDate);
        this(localDate);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.xpx) && aooh.n(this.b, ((defpackage.xpx) obj).b);
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ComplianceDate(complianceDate=" + this.b + ')';
    }

    public xpx(j$.time.LocalDate localDate) {
        aooh.f(localDate, "complianceDate");
        this.b = localDate;
    }
}
