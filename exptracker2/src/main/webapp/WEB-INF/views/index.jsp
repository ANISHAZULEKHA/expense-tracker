<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	
    <title>Expense Tracker</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <h2 class="text-center mb-4">💸 Expense Tracker</h2>

    <a href="/showNewExpenseForm" class="btn btn-primary mb-3">Add New Expense</a>

    <table class="table table-bordered table-striped">
        <thead class="table-dark">
            <tr>
                <th>Title</th>
                <th>Amount</th>
                <th>Category</th>
                <th>Date</th>
                <th>Notes</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="expense" items="${listExpenses}">
                <tr>
                    <td>${expense.title}</td>
                    <td>₹${expense.amount}</td>
                    <td>${expense.category}</td>
                    <td>${expense.expenseDate}</td>
                    <td>${expense.notes}</td>
                    <td>
                        <a href="/showFormForUpdate/${expense.id}" class="btn btn-sm btn-warning">Edit</a>
                        <a href="/deleteExpense/${expense.id}" class="btn btn-sm btn-danger">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
