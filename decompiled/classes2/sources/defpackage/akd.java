package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class akd {
    public static final defpackage.akd a;
    public static final defpackage.akd b;
    public static final defpackage.akd c;
    private static final /* synthetic */ defpackage.akd[] d;

    static {
        defpackage.akd akdVar = new defpackage.akd("Default", 0);
        a = akdVar;
        defpackage.akd akdVar2 = new defpackage.akd("UserInput", 1);
        b = akdVar2;
        defpackage.akd akdVar3 = new defpackage.akd("PreventUserInput", 2);
        c = akdVar3;
        defpackage.akd[] akdVarArr = {akdVar, akdVar2, akdVar3};
        d = akdVarArr;
        ajsz.am(akdVarArr);
    }

    public static defpackage.akd[] values() {
        return (defpackage.akd[]) d.clone();
    }
}
