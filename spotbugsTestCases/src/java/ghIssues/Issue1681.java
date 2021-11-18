package ghIssues;

public class Issue1681 {

    public static int deadstrokeinloop() {
        int output = 1;
        for (int i = 0; i < 1; i++) {
            output = output + 1;
        }
        return 0;
    }
    public static int deadstrokeinloop2() {
        int output = 1;
        int variable = 0;
        for (int i = 0; i < 3; i++) {
            output = output + variable;
        }
        return variable;
    }

}
