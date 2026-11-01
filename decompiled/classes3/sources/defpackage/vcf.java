package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vcf {
    public static final defpackage.vcf a;
    public static final defpackage.vcf b;
    public static final defpackage.vcf c;
    private static final /* synthetic */ defpackage.vcf[] d;

    static {
        defpackage.vcf vcfVar = new defpackage.vcf("PREFETCH_DISABLED", 0);
        a = vcfVar;
        defpackage.vcf vcfVar2 = new defpackage.vcf("PREFETCH_ONLY_WIFI", 1);
        b = vcfVar2;
        defpackage.vcf vcfVar3 = new defpackage.vcf("PREFETCH_ALWAYS", 2);
        c = vcfVar3;
        d = new defpackage.vcf[]{vcfVar, vcfVar2, vcfVar3};
    }

    public static defpackage.vcf[] values() {
        return (defpackage.vcf[]) d.clone();
    }
}
